package L04;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static int n = new Random().nextInt();

    public static void main(String[] args) {

        q1();
        q2();
        q3();
        q4();
        q5();


    }

    private static void q5() {

        for (int i = 1, k = 1; i <= n; i *= 2, k++) {
            for (int j = 0; j < k; j++) {
                System.out.println("Hello");
            }
        }
        // iter = 1 - > 1  i=1 , k=1
        // iter = 2 - > 2  i=2 , k=2
        // iter = 3 - > 3  i=4 , k=3
        // iter = 4 - > 4  i=8 , k=4
        // ...
        // ...
        // ...
        // iter = log(n) -> log(n) i=n  k=log(n)


        //logn(logn+1)/2
        ///log^2(n)/2 + logn/2
        // O(log^2(n))
    }

    private static void q4() {
        for (int i = 1; i <= n; i *= 2) {
            for (int j = 0; j < i; j++) {
                System.out.println("Hello");
            }
        }
        // iter = 1 -> 1
        // iter = 2 -> 2
        // iter = 3 -> 4
        // iter = 4 -> 8
        // ...
        // ...
        // ...
        // iter = log(n) -> n

        // O(log(n)(2^n-1))

    }

    private static void q3() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n; j *= 2) {
                System.out.println("Hello");
            }
        }
        // i=1 -> log(n)
        // i=2 -> log(n)
        // i=3 -> log(n)
        // i=4 -> log(n)
        // ...
        // ...
        // ...
        // i=n -> log(n)

        // O(nlog(n))

    }

    private static void q2() {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j *= 2) {
                System.out.println("Hello");
            }
        }
        // O(inf)
    }

    private static void q1() {

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("Hello");
            }
        }

        // i=1 -> 1
        // i=2 -> 2
        // i=3 -> 3
        // i=4 -> 4
        // ...
        // ...
        // ...
        // i=n -> n

        // n(n+1)/2 
        // n^2/2 + n/2 = O(n^2)
    }
}
