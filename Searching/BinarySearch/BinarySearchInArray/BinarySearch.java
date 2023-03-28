package Searching.BinarySearch.BinarySearchInArray;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 7, 16, 18, 19, 20, 29, 36, 50 };
        int target = 20;

        System.out.println(Searching(arr, target));

    }

    static int Searching(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(arr[mid]>target){
                end = mid-1;
            }
            if(arr[mid]<target){
                start = mid +1;
            }
        }
        return -1;
    }

}
