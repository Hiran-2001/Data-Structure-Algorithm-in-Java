package Searching.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={2,5,7,12,16,18,19,20,29,36,50};
        int target = 501;

        int result = search(arr, target);
        System.out.println(result);
    }

    static int search(int[] arr, int target){
        int start = arr[0];
        int end =   arr.length -1;
        
       for(int index = 0; index<arr.length;index++){
        int mid = (start+end)/2;

         if(target > arr[mid]){
               start = mid +1;
         }else if(target < arr[mid]){
            end = mid -1;
         }else{
            return mid;
         }

       }
       return -1;
    }
}
