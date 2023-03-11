package Searching.LinearSearch;

import java.util.Scanner;

public class SearchRange {
    public static void main(String[] args) {
        int[] arr = {45,3,89,6,21,63,96,14,36};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ranges to search");
        int rangeFrom = input.nextInt();
        int rangeTo = input.nextInt();
        System.out.println("Enter the target");
        int target = input.nextInt();
     int result = SearchRangeFun(arr, rangeFrom,rangeTo,target);
     System.out.println(result);
    }

    static int SearchRangeFun(int[] arr, int rangeFrom,int rangeTo,int target){
        
        if(arr.length == 0){
             return  -1;
        }
        for(int index = rangeFrom; index<rangeTo; index++){
            if(target == arr[index]){
                return index;
            }
        }
        return -1;
    }
}
