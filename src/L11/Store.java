package L11;

public class Store {
    private Tablet tablets[];
    private int systems[];

    public Store() {
        tablets = new Tablet[1000];
        systems = new int[3];
    }

    public boolean addTablet(Tablet tab) {
        if (tab == null)
            return false;
        int size = systems[0] + systems[1] + systems[2];
        if (size == tablets.length)
            return false;
        for (int i = 0; i < size; i++) {
            if (tab.isSame(tablets[i])) {
                tablets[i].setPrice(Math.max(tab.getPrice(), tablets[i].getPrice()));
                return true;
            }
        }

        tablets[size] = tab;
        char sys = tab.getSystem();
        if (sys == 'W')
            systems[0]++;
        else if (sys == 'A')
            systems[1]++;
        else
            systems[2]++;
        return true;
    }

    public int sortStore() {
        int size = systems[0] + systems[1] + systems[2];
        if (size == 0)
            return tablets.length;

        Tablet W[] = new Tablet[systems[0]];
        Tablet A[] = new Tablet[systems[1]];
        Tablet I[] = new Tablet[systems[2]];

        int w = 0, a = 0, i = 0;
        for (int j = 0; j < size; j++) {
            char sys = tablets[j].getSystem();
            if (sys == 'W')
                W[w++] = tablets[j];
            else if (sys == 'A')
                A[a++] = tablets[j];
            else
                I[i++] = tablets[j];
        }
        int ind =0;
        for (int j = 0; j < w; j++)
            tablets[ind++]=W[j];

        for (int j = 0; j < a; j++)
            tablets[ind++]=A[j];

        for (int j = 0; j < i; j++)
            tablets[ind++]=I[j];

        return tablets.length - size;
    }
}

class Tablet {

    private String name;
    private String kind;
    private char system;
    private double size;
    private double price;


    public Tablet(String name, String kind, char system, double size, double price) {
        this.name = name;
        this.kind = kind;
        this.system = system;
        this.size = size;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public char getSystem() {
        return system;
    }

    public void setSystem(char system) {
        this.system = system;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSame(Tablet other) {
        return other.getName().equals(this.name) &&
                other.getKind().equals(this.kind) &&
                other.getSize() == this.size;
    }
}
