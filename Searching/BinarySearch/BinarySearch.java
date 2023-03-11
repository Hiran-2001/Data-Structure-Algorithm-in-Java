package Searching.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr [] = {1,2,6,9,12,15,18,26,27,36,38,46};
    int target  = 18;

    int ans = search(arr, target);
    System.out.println(ans);
    }

    
    static int search(int[] arr, int target){

        int start = 0;
        int end = arr.length -1;
    
        while(start <= end){

            int mid = (start + end)/2;

            if(target < arr[mid]){
                end = end - 1;
            }
            else if(target > arr[mid]){
                start = start + 1;
            }
            else{
                return mid;
            } 
            
        }
        return -1;

    }
}
