package Sorting.SelectionSort;

import java.util.Arrays;

public class DsdSelectionSort {
    public static void main(String[] args) {
        int[] arr = { 11, 5, 37, 2, 88, 13 };
         System.out.println(Arrays.toString(arr));
         sort(arr);
         System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int minIndex = findMinIndex(arr, last);
            swap(arr, minIndex, last);
        }
    }

    static int findMinIndex(int[] arr, int last) {
        int min = 0;
        for (int i = 1; i <= last; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}