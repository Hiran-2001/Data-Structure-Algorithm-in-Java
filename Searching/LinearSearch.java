package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int[] arr = {56,654,16,465,564,21,663,5,36,4};
        System.out.println("enter a number to search:");
      int target = input.nextInt();

     boolean result =  searchNumber(arr, target);
     System.out.println(result);
    }

    static boolean searchNumber(int arr[],int target){
         if(arr.length == 0){
            return false;
         } 
          for(int index = 0;index < arr.length; index++){
             int element = arr[index];
             if(target == element){
               return true;
             } 
          }
         return false;
    }

}
