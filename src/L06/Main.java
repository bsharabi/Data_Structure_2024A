package L06;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            int l = lineRec(i);
            System.out.print(l + " ");
            l = line(i);
            System.out.println(l);
        }
        int n = 10;
        int f = fib(n);
        System.out.println(f);
        f = fibC(n);
        System.out.println(f);

        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[101];

        for (int i = 0; i < 100; i++) {
            arr2[i] = arr[i];
        }
        arr2[100] = 100;
        System.out.println(Arrays.toString(arr2));


//        int i=0;
//        int[] arr3 =  new int[5];
//        while(true){
//            if(arr3.length ==i)
//            {
//                System.out.println(Arrays.toString(arr3));
//                int[] temp = new int[arr3.length+1];
//                for (int j = 0; j < arr3.length; j++) {
//                    temp[j]=arr3[j];
//                }
//                arr3=temp;
//            }
//            System.out.println("Enter Number");
//            arr3[i++]=sc.nextInt();
//
//
//        }
//        ArrayList<Integer> al = new ArrayList<>();
//        while (true) {
//            al.add(sc.nextInt());
//        }

        Person p = new Person("Barak");
        MyArrayList<Person > mar = new MyArrayList<>();
        mar.add(p);
        p.name="k";






    }

    static class Person{
        String name;

        public Person(String name) {
            this.name = name;
        }
    }

    private static int fibC(int n) {
        return (int) ((1 / Math.sqrt(5)) * ((Math.pow(((1 + Math.sqrt(5)) / 2), n)) - (Math.pow(((1 - Math.sqrt(5)) / 2), n))));
    }

    private static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    private static int line(int n) {
        return 1 + (n * (n + 1)) / 2;
    }

    //O(n)
    private static int lineRec(int n) {
        if (n == 0)
            return 1;
        return lineRec(n - 1) + n;
    }
}
