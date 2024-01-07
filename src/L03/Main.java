package L03;

public class Main {
    public static void main(String[] args) {

        int ans = countNumber(new int[]{20, 0, 5, 7, 11, 0, 7, 11, 1, 4, 0, 4, 5, 20});
        ans = countNumberWithArr(new int[]{20, 0, 5, 7, 11, 0, 7, 11, 1, 4, 0, 4, 5, 20});


    }

    // n = the number of digits in the number
    // a = 3
    // b = 2
    // 3n+2
    // number = 98374932
    // n = 8
    // 3*8 +2 =26
    private static void algo3(int number) {
        int count = 0;

        while (number != 0) {
            count++;
            number /= 10;
        }

        System.out.println("counter -> " + count);

    }

    // n = the number of digits in the number
    // a = 4
    // b = 4
    // 4n+4
    private static boolean algo4(int number, String str) {
        int count = 0;

        while (number != 0) {
            count++;
            number /= 10;
            str += number;
        }

        System.out.println("counter -> " + count);
        System.out.println("str -> " + str);
        return str.length() <= count;
    }

    // n = the number of digits in the number
    // m = str len
    // b = 6
    // a = 3
    // z = 6
    // an + zm + b
    // 3n + 6m + 6
    // n' = max(m,n)
    private static boolean algo5(int number, String str) {
        int count = 0;

        while (number != 0) {
            count++;
            number /= 10;
        }

        char ch;
        for (int i = 0; i < str.length(); i++) {
            System.out.println(((ch = str.charAt(i)) == 'd') ? ch : 'd');
        }

        System.out.println("counter -> " + count);
        System.out.println("str -> " + str);
        return str.length() <= count;
    }

    // a = 3
    // b = 2
    // 3(n/2)+2
    // O(n)
    private static boolean isPrime(int n) {

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;

    }

    // a = 3
    // b = 2
    // 3(n/2)+2
    // O(sqrt(n))
    private static boolean isPrime2(int n) {
        double size = Math.sqrt(n);
        for (int i = 2; i <= size; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    private static int fib(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    private static int fib2(int n) {
        if(n<0)
            return -1;
        if (n == 0 || n == 1)
            return 1;

        int[] fibArr = new int[n];
        fibArr[0] = fibArr[1] = 1;

        for (int i = 2; i <n ; i++) {
            fibArr[i]=fibArr[i-1]+fibArr[i-2];
        }


        return fibArr[n-1];
    }

    //O(n)
    private static int countNumberWithArr(int[] arr) {

        if (arr == null) // 1
            return Integer.MAX_VALUE;

        int[] counter = new int[20]; // 1

        for (int i = 0 /*1*/; i < arr.length; i++) // 3n -> O(n)
            counter[arr[i]]++;

        int max = 0; // 1

        for (int i = 0; i < counter.length; i++) {
            if (counter[max] > counter[i])
                max = i;
        } // O(1)

        return max;

    }
    //O(n)

    private static int countNumberWithArr2(int[] arr) {

        if (arr == null) // 1
            return Integer.MAX_VALUE;

        int[] counter = new int[20]; // 1

        for (int i = 0 /*1*/; i < arr.length; i++) // 3n -> O(n)
            counter[arr[i]]++;

        int max = 0; // 1

        for (int i = 0; i < counter.length; i++) {
            if (counter[max] > counter[i])
                max = i;
        } // O(1)

        return max;

    }

    //O(n^2)
    private static int countNumber(int[] arr) {
        if (arr == null)
            return Integer.MAX_VALUE;

        int counter = 0;
        int min = 1;
        int num = arr[0];
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    counter++;
            }
            if (counter > min) {
                min = counter;
                num = arr[i];
            }
            counter = 0;
        }
        return num;
    }

}
