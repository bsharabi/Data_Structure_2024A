package L09;

import java.util.Random;

public class Targil {
    static Random rd = new Random();

    public static void main(String[] args) {
        Node<Integer> head = null;
        for (int i = 0; i < 20; i++)
            head = add(head, rd.nextInt(120));
        print(head);
        int sum = sumOfChain(head);
        System.out.println("Sum -> " + sum);
    }

    private static int sumOfChain(Node<Integer> head) {

        if (head == null)
            return 0;

        int sum = 0;

        while (head != null) {
            sum += head.getValue();
            head = head.getNext();
        }

        return sum;
    }

    private static void print(Node<Integer> head) {
        if (head == null)
            return;
        while (head != null) {
            System.out.print(head.getValue() + " -> ");
            head = head.getNext();
        }
        System.out.println("null");
    }

    private static Node<Integer> add(Node<Integer> head, int value) {
        if (head == null)
            return new Node<>(value);
        Node<Integer> newNode = new Node<>(value);
        newNode.setNext(head);
        return newNode;
    }
}
