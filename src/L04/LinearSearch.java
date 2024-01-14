package L04;

import java.util.Arrays;
import java.util.Random;

public class LinearSearch {

    static Random rd = new Random();

    public static void main(String[] args) {
        int[] arr = new int[rd.nextInt(20) + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(50);
        }

        int num = rd.nextInt(100);
        int index = LinearSearchSean(arr, num);

        Arrays.sort(arr);
        index = BinarySearchSean(arr, num);




    }
    //O(log(n))
    private static int BinarySearchSean(int[] arr, int num) {

        if (arr == null)
            return -1;

        int low = 0;
        int high = arr.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == num)
                return mid;
            else if (num > arr[mid])
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;
    }

    // O(n)
    private static int LinearSearchSean(int[] arr, int num) {
        if (arr == null)
            return -1;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] == num)
                return i;

        return -1;
    }
}
