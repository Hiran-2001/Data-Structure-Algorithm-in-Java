package Searching;

public class FindMaxTwoD {
    public static void main(String[] args) {
        int[][] arr = {
            {63,45,26},
            {76,31,36},
            {83,11,271},
        };
            
        int result = maxVal(arr);
        System.out.println(result);
    }


    static int maxVal(int[][] arr){
        int max = arr[0][0];
     
        if(arr.length == 0){
               return -1;
        }

        for(int row = 0; row<arr.length;row++){
            for(int col = 0; col<arr[row].length;col++){
                if(arr[row][col]> max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
