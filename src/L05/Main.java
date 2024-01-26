package L05;


import java.util.Arrays;
import java.util.Random;

public class Main{
    static Random rd = new Random();

    public static void main(String[] args) {
        int n = 10;
        int base = 2, exp = 5;
        int f = factorial(n); //(1,1,2,6,24,120,720,....) f0=1, f1=1, f2=2,f3=6,...,f6=720, fn=fn-1*n
        // f3= f2*3= (1*1*2*3)
        int s = sumN(n);// (0,1,3,7,....,55,....) Sn = Sn-1 + n
        // s4 = s3 +4 = 3+4 = 7
        int p = pow(base, exp); // 2^6 = base = 2 , exp = 6
        int[] arr = new int[rd.nextInt(50)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int num = rd.nextInt(30);
        int index = BinarySearchRec(arr, num);

    }

//    public static <B,E> B pow(B base , E exp);

    public static int BinarySearchRec(int[] arr, int num) {
        if (arr == null)
            return -1;
        int low = 0, high = arr.length - 1;
        return BinarySearchRec(arr, low, high, num);
    }

    // [] [1]
    //[6, 9, 12, 17, 21, 23, 26, 30, 32, 35, 61, 62, 62, 72, 72, 73, 76, 86, 87, 87, 90, 96]
    private static int BinarySearchRec(int[] arr, int low, int high, int num) {

        int mid = (low + high) / 2;
        if (arr[mid] == num)
            return mid;

        if (low >= high)
            return -1;

        if (arr[mid] < num)
            return BinarySearchRec(arr, mid + 1, high, num);

        return BinarySearchRec(arr, low, mid - 1, num);
    }

    private static int pow(int base, int exp) {

        if (exp == 0)
            return 1;
        return pow(base, exp - 1) * base;
    }

    private static int sumN(int n) {
        if (n == 0)
            return 0;
        return sumN(n - 1) + n;
    }

    private static int factorial(int n) {
        if (n == 0)
            return 1;
        return factorial(n - 1) * n;
    }
}
