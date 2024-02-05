package L07;

import java.util.Random;
import java.util.Stack;

public class Main {
    static Random rd = new Random();

    public static void main(String[] args) {

        Stack<Character> st = new Stack<>();
        String s = "";
        for (int i = 0; i < 10; i++) {
            s += rd.nextBoolean() ? ")" : "(";
        }
        System.out.println(s);

        boolean bool = balancedBrackets(s);

//        int count =0;
//        while(st.isEmpty()){
//            count++;
//            int num = st. pop();
//            if( num == rd.nextInt())
//                return true;
//
//            if(st.peek()==rd.nextInt())
//                return true;
//
//        }

        Stack<Integer> st1 = new Stack<>();
        st1.push(6);
        st1.push(12);
        st1.push(2);
        st1.push(10);
        st1.push(7);
        st1.push(5);


        Stack<Integer> st2 = new Stack<>() {{
            push(6);
            push(12);
            push(2);
            push(10);
            push(7);
            push(5);
        }};

//        System.out.println(st2);
//        System.out.println(st2.pop());
//        System.out.println(st2);

        System.out.println(st2);
        func(st2);
        System.out.println(st2);


        Stack<Integer> stack = new Stack<>() {{
            push(7);
            push(22);
            push(10);
            push(12);
            push(21);
            push(25);
            push(4);
            push(13);
            push(15);
            push(3);
            push(18);
        }};
        System.out.println(stack);
        bool = equalSums(stack);
        System.out.println(bool);
        System.out.println(stack);


    }

    private static boolean equalSums(Stack<Integer> st) {
        if (st == null || st.isEmpty())
            return false;
        Stack<Integer> sTemp1 = new Stack<>();
        Stack<Integer> sTemp2 = new Stack<>();
        int size = 0;
        while (!st.isEmpty()) {
            size++;
            sTemp1.push(st.peek());
            sTemp2.push(st.pop());
        }
        while (!sTemp2.isEmpty())
            st.push(sTemp2.pop());


        if (size % 2 == 0)
            return false;

        for (int i = 0; i < size / 2; i++) {
            sTemp2.push(sTemp1.pop());
        }

        int mid = sTemp1.pop();

        while (!sTemp1.isEmpty()) {
            if (sTemp1.pop() + sTemp2.pop() != mid)
                return false;

        }

        return true;

    }

    private static void func(Stack<Integer> st) {
        if (st == null || st.isEmpty())
            return;

        int count = 0;
        int sum = 0;
        Stack<Integer> temp = new Stack<>();
        System.out.println(st);
        while (!st.isEmpty()) {
            count++;
            sum += st.peek();
            temp.push(st.pop());
        }
        System.out.println(temp);
        double avg = (double) sum / count;
        Stack<Integer> temp2 = new Stack<>();
        while (!temp.isEmpty()) {
            if (temp.peek() <= avg)
                st.push(temp.pop());
            else
                temp2.push(temp.pop());
        }


        while (!temp2.isEmpty())
            st.push(temp2.pop());


    }

    private static boolean balancedBrackets(String s) {
        if (s == null || s.length() % 2 != 0)
            return false;

        //()()()(())()(())((
        // st -> ((
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } else {
                if (st.isEmpty())
                    return false;
                st.pop();
            }
        }

        return st.isEmpty();
    }
}
