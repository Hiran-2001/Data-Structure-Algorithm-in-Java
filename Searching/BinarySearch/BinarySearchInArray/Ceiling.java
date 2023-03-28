package Searching.BinarySearch.BinarySearchInArray;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 7, 13, 15, 18, 21, 29, 40 };
        int target = 30;
        int result = Search(arr, target);
        System.out.println(result);
    }

    static int Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr.length == 0) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return start;
    }
}