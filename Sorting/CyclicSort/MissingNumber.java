package Sorting.CyclicSort;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr={4,0,2,1};
       System.out.println(Arrays.toString(arr));
    

       System.out.println( missingNumber(arr));
    }

    static int missingNumber(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i];

            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;

                
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
