package L10;


import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Node<Integer> head = new Node<>(1, new Node<>(2, new Node<>(3, new Node<>(4))));
        print(head);
        first(head);
        print(head);

        Node<Integer> head2 = new Node<>(9, new Node<>(2, new Node<>(5, new Node<>(4))));
        print(head2);
        second(head2);
        print(head2);


        Queue<Integer> marks = new LinkedList<>() {{
            for (int item : new int[]{80, 90, 100, 75, 96, 100, 100, 97, 96, 88, 94}) {
                add(item);
            }
        }};
        System.out.println(marks);
        Queue<Integer> tests = new LinkedList<>() {{
            for (int item : new int[]{3, 2, 4, 2}) {
                add(item);
            }
        }};
        System.out.println(tests);

        System.out.println(averageQueue(marks, tests));


        System.out.println(   numDigits(head));
        System.out.println(numDigits(null));
        System.out.println(compare(head,head2.getNext()));
        System.out.println(compare(head,head));
        System.out.println(compare(null,head));
        System.out.println(compare(head,null));
    }

    // n = marks.size();
    // O(n)
    public static Queue<Double> averageQueue(Queue<Integer> marks, Queue<Integer> tests) {
        if (marks == null || tests == null)
            return null;

        Queue<Double> avg = new LinkedList<>();
        int sum = 0;
        int count = 0;

        while (!marks.isEmpty() && !tests.isEmpty()) {
            sum += marks.remove();

            if (++count == tests.peek()) {
                avg.add((double) sum / count);
                count = sum = 0;
                tests.remove();
            }
        }
        return avg;
    }

    private static void print(Node<Integer> head) {

        if (head == null)
            return;

        while (head != null) {
            System.out.print(head.value + " -> ");
            head = head.getNext();
        }
        System.out.println("null");
    }

    public static void first(Node<Integer> chain) {
        // 1 -> 2 -> 3 -> 4 -> null
        // 1
        while (chain != null) {
            Node<Integer> node = new Node<>(chain.getValue(), chain.getNext());
            chain.setNext(node);
            chain = node.getNext();
        }
    }

    public static void second(Node<Integer> chain) {
        if (chain == null)
            return;

        Node<Integer> head = new Node<>(chain.getValue());
        Node<Integer> temp = head;

        while (chain.hasNext()) {
            chain = chain.getNext();
            Node<Integer> node = new Node<>(chain.getValue());
            temp.setNext(node);
            temp = temp.getNext();
        }
        chain.setNext(head);
    }

    public static int numDigits(Node<Integer> n) {
        int count = 0;

        while (n != null) {
            count++;
            n = n.getNext();
        }
        return count;

    }

    public static int compare(Node<Integer> n1, Node<Integer> n2) {

        int m = numDigits(n1);
        int k = numDigits(n2);
        if (m > k)
            return 1;
        else if (m < k)
            return 2;
        while (n1 != null && n2 != null) {
            if (n1.getValue() > n2.getValue())
                return 1;
            else if (n1.getValue() < n2.getValue())
                return 2;
            n1 = n1.getNext();
            n2 = n2.getNext();
        }
        return 0;
    }

    static class Node<E> {
        private E value;
        private Node<E> next;

        public Node(E value) {
            this.value = value;
            this.next = null;
        }

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public boolean hasNext() {
            return next != null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

}
