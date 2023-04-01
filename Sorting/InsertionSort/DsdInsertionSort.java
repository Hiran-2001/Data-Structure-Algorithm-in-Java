package Sorting.InsertionSort;

import java.util.Arrays;

public class DsdInsertionSort {
    public static void main(String[] args) {
        int [] arr ={26,74,93,1,47,13,6,11};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int [] arr){
        for(int i = arr.length -1;i >0 ;i--){
            for(int j = i-1; j<arr.length-1; j++){
                if(arr[j] < arr[j+1]){
                    swap(arr,j,j+1);
                }else{
                    break;
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
