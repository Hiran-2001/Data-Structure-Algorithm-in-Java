package Searching.LinearSearch;

import java.util.Scanner;

public class LinearSearch {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] arrName = { 10, 3, 5, 69, 15, 20 };
    int target = 115;

    System.out.println(Loop(arrName, target)) ;

  }

  static int Loop(int[] arr, int target) {

    for (int i = 0; i < arr.length; i++) {
      if (target == arr[i]) {
        return i;
      }
    }
    return -1;
  }

}
