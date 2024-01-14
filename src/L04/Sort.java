package L04;

import java.util.Arrays;
import java.util.Random;


public class Sort {
    static Random rd = new Random();

    public static void main(String[] args) {
        int[] arr = new int[rd.nextInt(20) + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(50);
        }
        System.out.println("----------------bubbleSort-----------------");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(50);
        }
        System.out.println("----------------SelectionSort-----------------");
        System.out.println(Arrays.toString(arr));
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //O(n^2)
    private static void SelectionSort(int[] arr) {

        if (arr == null)
            return;
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            int minIndex = min(i, arr);
            swap(arr,i,minIndex);
        }


    }

    //O(n)
    private static int min(int index, int[] arr) {
        if (arr == null)
            return -1;
        int inx =index;
        for (int i = index; i < arr.length; i++) {
            if (arr[inx] > arr[i])
                inx = i;
        }
        return inx;
    }

    private static void bubbleSortImproving2(int[] arr) {
        if (arr == null)
            return;
        int size = arr.length;

        boolean bool = false;

        for (int j = 0; j < size - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                bool = true;
                break;
            }
        }

        if (bool)
            return;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
    }

    // i=0 {10,9,8,7,6,5,4,3,2,1}
    // j=0 {9,10,8,7,6,5,4,3,2,1}
    // j=1 {9,8,10,7,6,5,4,3,2,1}
    // j=2 {9,8,7,10,6,5,4,3,2,1}
    // j= size-1
    // i=1 {9,8,7,6,5,4,3,2,1,10}
    // j=0 {8,9,7,6,5,4,3,2,1,10}
    // j=1 {8,7,9,6,5,4,3,2,1,10}
    // j=2 {8,7,6,9,5,4,3,2,1,10}
    // j=size-2 {8,7,6,5,4,3,2,9,1,10}
    // j= size-1

    //0(n^2) n^2/2 + n/2
    private static void bubbleSortImproving(int[] arr) {
        if (arr == null)
            return;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
    }

    // i=0 {10,9,8,7,6,5,4,3,2,1}
    // j=0 {9,10,8,7,6,5,4,3,2,1}
    // j=1 {9,8,10,7,6,5,4,3,2,1}
    // j=2 {9,8,7,10,6,5,4,3,2,1}
    // j= size-1
    // i=1 {9,8,7,6,5,4,3,2,1,10}
    // j=0 {8,9,7,6,5,4,3,2,1,10}
    // j=1 {8,7,9,6,5,4,3,2,1,10}
    // j=2 {8,7,6,9,5,4,3,2,1,10}
    // j=size-2 {8,7,6,5,4,3,2,9,1,10}
    // j= size-1
    // O(n^2)
    private static void bubbleSort(int[] arr) {
        if (arr == null)
            return;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
