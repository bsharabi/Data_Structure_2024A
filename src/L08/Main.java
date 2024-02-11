package L08;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start");
        Queue<Integer> q1 = new LinkedList<>() {{
            Random rd = new Random();
            int rand = rd.nextInt(10);
            for (int i = 0; i < rand; i++) {
                add(rd.nextInt(10));
            }
        }};

        Queue<Integer> q2 = new LinkedList<>();


        for (int i = 0; i < 10; i++) {
            q2.add(i);
        }

        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q1.remove());
        System.out.println(q2.remove());


        System.out.println(q1);
        System.out.println(q2);

        MyQueue<Integer> mq = new MyQueue<>();
        for (int i = 0; i < 5; i++) {
            mq.add(i);
        }
        System.out.println(mq);
        System.out.println(mq.remove());
        System.out.println(mq.remove());
        mq.add(5);
        mq.add(6);
        System.out.println(mq);
        Collection<Integer>
                c = new ArrayList<>();

    }
}
