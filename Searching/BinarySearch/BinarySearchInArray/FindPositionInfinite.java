package Searching.BinarySearch.BinarySearchInArray;

public class FindPositionInfinite {

    public static void main(String[] args) {

        int[] arr = {3, 5, 7, 9, 10, 90,100, 130, 140, 160, 170,175,186};
        int target = 10;

        System.out.println(FindIndex(arr, target));
    }

    static int FindIndex(int[] arr, int target){
        
        int start = 0;
        int end = 1;

        while(arr[end] < target){
            int newStart = end + 1;

            end = end + (end - start + 1)*2;
            start = newStart;
        }
        // if(arr[end] >= target){
        //     return end;
        // }
       return search(arr, target,start,end);
    }

    static int search(int[] arr, int target,int start,int end) {
        

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}