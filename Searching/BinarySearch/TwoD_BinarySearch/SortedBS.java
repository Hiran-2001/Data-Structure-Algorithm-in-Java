package Searching.BinarySearch.TwoD_BinarySearch;

import java.util.Arrays;

public class SortedBS {
    public static void main(String[] args) {

        int[][] matrix = {
            
                { 1 }
        };
        int target = 1;
        System.out.println(search(matrix,target));

    }

    static boolean search(int[][] matrix, int target) {

        int row = 0;
        int col= matrix[row].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            }

            if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
                col = matrix[row].length -1;
            }
        }

        return false;
    }

}
