package L11;

import L09.Node;

public class Main {
    public static void main(String[] args) {

        Node<Integer> bin = new Node<>(1, new Node<>(0, new Node<>(0,
                new Node<>(1, new Node<>(0, new Node<>(0, new Node<>(0, new Node<>(0, new Node<>(0, new Node<>(0, new Node<>(1, new Node<>(0, new Node<Integer>(1)))))))))))));

        print(bin);
        int dec = binToDec(bin);
        System.out.println(dec);
        dec = binToDecimal(bin);
        System.out.println(dec);

    }

    private static void print(Node<Integer> bin) {
        while (bin != null) {
            System.out.print(bin.getValue() + " -> ");
            bin = bin.getNext();
        }
        System.out.println("null");
    }

    private static int binToDec(Node<Integer> bin) {
        if (bin == null)
            return 0;

        Node<Integer> temp = bin;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }

        int sum = 0;
        while (bin != null) {
            sum += (int) (bin.getValue() * Math.pow(2, --count));
            bin = bin.getNext();
        }

        return sum;
    }


    public static int binToDecimal(Node<Integer> bin) {
        if (bin == null)
            return 0;
        IncDec index = new IncDec();
        return binToDecimal(bin, index);

    }

    private static int binToDecimal(Node<Integer> bin, IncDec index) {
        if (!bin.hasNext())
            return bin.getValue();
        return binToDecimal(bin.getNext(), index) + (int) (bin.getValue() * Math.pow(2, index.get()));
    }
}

class IncDec {

    int index = 0;

    void inc() {
        index++;
    }

    void dec() {
        index--;
    }

    int get() {
        return ++index;
    }

}