package Sorting.BubbleSort;

import java.util.Arrays;

public class SimpleBubblesort {
    public static void main(String[] args) {
        int [] arr ={11,5,37,2,88,13};
       
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
