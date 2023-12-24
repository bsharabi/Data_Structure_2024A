package L01.inheritance;

public class Car2 {

    static int bum = 1;
    private byte j;
    public byte m;
    protected byte y;
    int num1 = 7;

    static public void getCar() {


    }
    static public void getCar(int n) {


    }
    public byte getM() {

        bum++;
        getCar();
        return m;

    }
}

class MainCar extends Car {

    static public void getCar() {


    }
    public static void main(String[] args) {
        //87632fx
        Car2 c = new Car2();
        //null - ,,,,-,,,,
        Car2[] cArr = new Car2[9999999];
        // 70x,...,133x         134x,...197x,
        //[0,0,0,0,0,0,0,0/---/0,0,0,0,0,0,0,0/---/0,0,0,0,0,0,0,0]
        cArr[0] = new Car2();
        cArr[1] = c;

        Car2[][] cMat = new Car2[2][];
        //[0,0,0,0,0,0,0,0/---/0,0,0,0,0,0,0,0]
        cMat[0] = cArr;

        Car2[][][] cMat3D = new Car2[2][][];
        cMat3D[0] = cMat;


    }
}
