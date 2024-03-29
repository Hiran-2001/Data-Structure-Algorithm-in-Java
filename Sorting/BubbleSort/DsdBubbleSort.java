package Sorting.BubbleSort;

import java.util.Arrays;

public class DsdBubbleSort {
    public static void main(String[] args) {
        int [] arr = {2,5,6,7,9,10,15};

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        
        for(int i = 0;i < arr.length;i++){
            for(int j=1;j<arr.length - i;j++){
                if(arr[j] > arr[j-1]){
                    swap(arr, j-1, j);
                }
            }
        }
    }

    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    
}
