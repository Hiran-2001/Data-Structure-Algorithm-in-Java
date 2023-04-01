package Sorting.CyclicSort;

import java.util.Arrays;

public class AsdCycleSort {
    public static void main(String[] args) {
        int [] arr ={5,2,4,1,3};

        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i =0;
        while(i<arr.length){
             int crctIndex = arr[i] - 1;
             if(arr[i] != arr[crctIndex]){
                swap(arr, i, crctIndex);
             }else{
                i++;
             }
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
