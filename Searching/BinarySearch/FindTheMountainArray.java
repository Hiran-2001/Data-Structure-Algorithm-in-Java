package Searching.BinarySearch;

public class FindTheMountainArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 6, 8, 9, 10, 15, 6, 2, 1 };

        int target = 8;

        int result = search(arr, target);

        System.out.println(result);
    }

    static int search(int[] arr, int target) {
        int peak = peakIndex(arr);

        int firstTry = orderAgnosticSearch(arr, 0, peak, target);

        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticSearch(arr, peak+1, arr.length -1, target);
    }

    static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid ;
            } else {
                start = mid +1;
            }

        }
        return start;
    }

 
    static int orderAgnosticSearch(int[] arr, int start ,int end, int target) {
        

        boolean isAsd = arr[start] < arr[end];

        while (start <= end) {
            int mid = (start + end) / 2;

            if(target == arr[mid]){
                return mid;
            }

            if (isAsd) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }

            }else{
                if (target < arr[mid]) {
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}
