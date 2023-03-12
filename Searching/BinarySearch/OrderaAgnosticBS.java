package Searching.BinarySearch;

public class OrderaAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = {1,5,9,12,19,35,42,48,53,55,68};
        int[] arr = { 68, 55, 53, 48, 42, 35, 19, 12, 9, 5, 1 };
        int target = 68;
        int result = Search(arr, target);
        System.out.println(result);
    }

    static int Search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        // checking isAsending or isDesenging;
        boolean isAsd = arr[start] < arr[end];
         

        // the common case for both asending and desending
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid;
            }

            if (isAsd) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;

    }
}
