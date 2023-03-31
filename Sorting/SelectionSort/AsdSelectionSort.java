package Sorting.SelectionSort;

import java.util.Arrays;

public class AsdSelectionSort {
    public static void main(String[] args) {
        int[] arr = { 41, 15, 39, 18, 9, 174, 3, 46, 23 };
        System.out.println(Arrays.toString(arr));
        sort(arr);
        // System.out.println(findMaxIndex(arr,5));
        // swap(arr, 5, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int last = arr.length - i -1;

            int maxIndex = findMaxIndex(arr,last);

            swap(arr,maxIndex,last);

        }
    }
  

    static int findMaxIndex(int[] arr,int last){
      int max = 0;
        for(int i =1;i<=last;i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int arr[],int first,int second){
        int temp = arr[second];
       arr[second] = arr[first];
       arr[first] = temp;
    }
   
}