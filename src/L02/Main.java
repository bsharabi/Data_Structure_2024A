package L02;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        algo1();
        long end = System.currentTimeMillis();

        System.out.println("---------------------------------------------");
        System.out.println("Algo 1 Time -> " + (end - start));
        System.out.println("---------------------------------------------");

        start = System.currentTimeMillis();
        algo2(300000);
        end = System.currentTimeMillis();

        System.out.println("---------------------------------------------");
        System.out.println("Algo 2 Time -> " + (end - start));
        System.out.println("---------------------------------------------");


        findD("Hello D");

        //41 = O(1)
        //9881 = O(1)
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            for (int j = 0; j < 80; j++) {
                System.out.println(j);
            }
        }


        int n = new Random().nextInt();
        //n = arr.len
        // 2n+1+n+241n = 244n+1 = n^2
        //O(n)
        for (int i = 0; i < n; i++) { // 2n+1
            System.out.println(i); // // n
            // 241n = O(1)
            for (int j = 0; j < 80; j++) { //1+80+80
                System.out.println(j); // 80
            }
        }


        findD2("Hello D");
        findD3("Hello D");

    }


    // 3n+6 = O(n)
    private static void findD3(String str) {

        str += "D"; // 1
        int n = str.length(); // 1
        char ch = str.charAt(0); // 1
        int i = 1; // 1

        while (ch != 'D') { // n
            ch = str.charAt(i++); // n
        }
        // 2
        if (i == n)
            System.out.println("X");
        else
            System.out.println("V");
    }

    // 4+ n/2 + n/2 + n/2+ n + 2 + n/2 + n/2 + 2
    // 3 * (n/2) + 8
    private static void findD2(String str) {

        int start = 0; // 1
        int end = str.length(); // 1
        boolean bool = false; // 1
        int n = end; // 1

        while (start <= end) { // n/2

            char sCh = str.charAt(start); // n/2
            char eCh = str.charAt(end); //n/2

            if (sCh == 'D' || eCh == 'D') { // n
                bool = true; // 1
                break; // 1
            }

            start++; // n/2
            end--; // n/2
        }
        // 2
        if (bool)
            System.out.println("V");
        else
            System.out.println("X");

    }

    // 4n+5 = O(n)
    // an+b
    // פונקציה היא מכונת קלט פלט כאשר מתקבל קלט היא פולטת פלט במקרה שלנו הקלט הוא מחרוזת והפלט כמות הפעולות שהאלגוריתם מבצע
    // באופ כללי, פונקציית זמן ריצה היא פונקציה שמקבלת כקלט גודל כלשהו ופולטת את מספר הפעולות של האלגוריתם
    // a = הצעד הבסיסי שחוזר על עצמו שוב ושוב במקרה שלנו הוא - 4
    // נסמן ב -b את מספר הפעולות הקבועות שמתבצעות לפני ואחרי הלולאה העיקרית כלומר b = 5
    private static void findD(String str) {

        char ch = str.charAt(0); // 1
        int i = 1; // 1
        int n = str.length();// 1

        // 4n
        for (; i < n && ch != 'D'; i++) {
            ch = str.charAt(i);
        }

        // 2
        if (i == str.length() - 1) //O(1)
            System.out.println("X"); //0(1)
        else
            System.out.println("V"); //O(1)
    }
    // a=4 , b=5 -> a*n+b = 4*n+5

    private static void algo2(int n) {
        if (n == 0)
            return;
        System.out.println("Hello");
        algo2(n - 1);
    }

    private static void algo1() {
        for (int i = 0; i < 30; i++) {
            System.out.println("Hello");
        }
    }



}
