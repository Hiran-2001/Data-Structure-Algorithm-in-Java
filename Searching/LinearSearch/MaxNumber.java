package Searching.LinearSearch;

public class MaxNumber {
 public static void main(String[] args) {
    int[] arr = {56,12,64,5,166,2,744,63,4};

    int result = MaxNumberFun(arr); 
    System.out.println(result);
 }

 static int MaxNumberFun(int[] arr){
    if(arr.length==0){
          return -1;
    } 
    int max = arr[0];
    for(int index = 1;index<arr.length;index++){
        if(arr[index]>max){
            max = arr[index];
        }
    }
    return max;
 }
}
