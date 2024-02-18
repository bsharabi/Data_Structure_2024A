package L09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Node<Integer> head = new Node<>(0);
//        Node<Integer> h2 = new Node<>(1);
//        head.setNext(h2);
        head.setNext(new Node<>(1));

//       Node<Integer> temp = head.getNext();
//       temp.setNext(new Node<>(2));

        head.getNext().setNext(new Node<>(2));
        head.getNext().getNext().setNext(new Node<>(3));
        print(head);

        Node<Integer> head2 = new Node<>(0);
        Node<Integer> temp = head2;
        head2 = new Node<>(1);
        head2.setNext(temp);
        temp = head2;
        head2 = new Node<>(2);
        head2.setNext(temp);
        temp = head2;
        head2 = new Node<>(3);
        head2.setNext(temp);

        print(head2);


        int value = 4;
        boolean bool = add(value, head);
        print(head);
        add(5, head);
        add(6, head);
        add(7, head);
        print(head);

        head = add(head, -1);

        print(head);


        LinkedList<Integer> ll = new LinkedList<>(){{
            for (int i = 0; i < 10; i++) {
                add(i);
            }
        }};

        sum(ll);
        System.out.println(sum(ll));
        ArrayList<Integer> al = new ArrayList<>(){{
            for (int i = 0; i < 10; i++) {
                add(i);
            }
        }};
        System.out.println(sum(al));

    }

    private static int sum(List<Integer> list) {

        int sum =0;

        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
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

    private static boolean add(int value, Node<Integer> head) {
        if (head == null)
            return false;

        while (head.hasNext())
            head = head.getNext();

        head.setNext(new Node<>(value));
        return true;
    }

    private static Node<Integer> add(Node<Integer> head, int value) {
        if (head == null)
            return new Node<>(value);

        Node<Integer> newNode = new Node<>(value);
        newNode.setNext(head);
//        Node<Integer> newNode = new Node<>(value,head);
        return newNode;
    }

}
