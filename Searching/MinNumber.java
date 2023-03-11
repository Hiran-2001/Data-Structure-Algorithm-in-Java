package Searching;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {16,13,6,45,36,61,5,81,52,5};

        int minNumber = searchMin(arr);
        System.out.println(minNumber);
    }

    static int searchMin(int[] arr){
        int min = arr[0];
        if(arr.length ==0){
            return -1;
        }
        for(int index = 1;index<arr.length;index++){
              if(arr[index] < min ){
                min = arr[index];
              }
        }
        return min;
    }
}
