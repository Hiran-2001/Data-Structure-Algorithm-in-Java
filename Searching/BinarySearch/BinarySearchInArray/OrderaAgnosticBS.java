package Searching.BinarySearch.BinarySearchInArray;

import java.util.Scanner;

public class OrderaAgnosticBS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] asdArr = { 1, 3, 8, 12, 19, 26, 29, 36, 46, 48, 50, 55 };
        int[] desArr = { 55, 50, 48, 46, 36, 29, 26, 19, 12, 8, 3, 1 };
        System.out.println("Enter a number to check whether it is in the array or not");
        int target = input.nextInt();
        int result = Search(desArr, target);
        System.out.println(result);
    }

    static int Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
