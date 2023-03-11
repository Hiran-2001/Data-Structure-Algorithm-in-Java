package Searching.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchTwoDimensional{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[][] arr = {
            {45,36,96},
            {92,36,42},
            {13,75,32}
        };
        int target = input.nextInt();

       int[] result =  searchInTwoDimension(arr,target);
           System.out.println(Arrays.toString(result));  
        // for(int row=0;row<arr.length;row++){
        //     for (int col = 0; col < arr.length; col++) {
        //         System.out.print(arr[row][col]+ " ");
        //     }
        //     System.out.println();
        // }
    }

    static int[] searchInTwoDimension(int[][] arr, int target){
        if(arr.length == 0){
        return new int[]{-1,-1};
        }

        for(int row =0; row<arr.length;row++){
            for(int col =0 ;col<arr[row].length;col++){
                if(arr[row][col] == target){
                     return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    
}