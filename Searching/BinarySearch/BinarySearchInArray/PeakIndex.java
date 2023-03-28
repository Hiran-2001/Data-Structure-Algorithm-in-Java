package Searching.BinarySearch.BinarySearchInArray;

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 19, 14, 3, 1 };
        System.out.println(FindIndex(arr));
    }

    static int FindIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
        }
        return start;
    }
}