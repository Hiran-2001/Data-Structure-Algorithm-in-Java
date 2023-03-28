package Searching.BinarySearch.BinarySearchInArray;

public class Flooring {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 16, 19, 26, 39, 46, 57, 60 };
        int target = 17;
        int result = SearchFlooring(arr, target);
        System.out.println(result);
    }

    static int SearchFlooring(int[] arr, int target) {
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
        return end;
    }
}
