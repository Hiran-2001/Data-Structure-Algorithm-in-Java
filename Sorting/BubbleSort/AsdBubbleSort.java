package Sorting.BubbleSort;

import java.util.Arrays;

public class AsdBubbleSort {
    public static void main(String[] args) {
        int[] arr = { 6, 9, 3, 59, 15 };

        bubbleSortinAscending(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSortinAscending(int[] arr) {

        // run the step n-1 times
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    // int temp = arr[j];
                    // arr[j] = arr[j - 1];
                    // arr[j - 1] = temp;
                    swap(arr, j-1, j);
                }

            }
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

   
}
