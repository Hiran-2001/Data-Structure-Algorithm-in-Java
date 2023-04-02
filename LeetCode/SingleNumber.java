package LeetCode;

import java.util.Arrays;


public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 7, 2, 6 };
        System.out.println(Arrays.toString(arr));
        
        System.out.println(sort(arr));

    }

    static int sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int crctPosition = arr[i] - 1;

            if (arr[i] <= arr.length && arr[i] != arr[crctPosition]) {
                swap(arr, i, crctPosition);
            } else {
                i++;
            }
        }



        int missingNumber = 0;
        for(int j=0;j<arr.length;j++){
            if(arr[j] != j+1){
              missingNumber = j+1;
            }
        }
        return missingNumber;
    }




    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
