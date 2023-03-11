package Searching.LinearSearch;

public class MinNumberTwoD {
    public static void main(String[] args) {
        int [][] arr = {
            {45,36,19,18},
            {75,6,3,98},
            {39,326,128},
            {43,367,- 19,14},
        };
      int result = minVal(arr);
      System.out.println(result);
    }

    static int minVal(int[][] arr){
        int min = arr[0][0];
        for(int row = 0; row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]< min){
                    min = arr[row][col];
                }
            }
        }

        return min;
    }
}
