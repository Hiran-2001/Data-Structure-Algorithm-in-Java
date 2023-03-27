package Searching.BinarySearch;

public class FindInRotatedArr {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 10, 16, 18, 26, 1, 2, 3};
        int target = 7;

        System.out.println(FindPivot(arr));
    }

    static int FindPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]  && arr[mid] > arr[start - 1]) {
                return mid;
            } else {
                start = start + 1 ;
                end = end -1;
            }
        }

        return start;
    }
}
