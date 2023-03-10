package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {4,2,7,33,97,4,3,87,12};
        System.out.println("enter a random number to check that it is in the array or not");
        int target = input.nextInt();

       int result = linearSearch(arr , target);
       System.out.println(result);
    }
    static int linearSearch(int[] arr, int target){
         
        if(arr.length == 0 ){
            return -1;
        }

        for(int index = 0; index < arr.length; index++){
           int element = arr[index];
           if(element == target){
            return index;
           }
        }
       
        return -1;
    }
}
