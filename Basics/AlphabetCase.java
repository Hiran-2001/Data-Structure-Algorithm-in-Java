package Basics;

import java.util.Scanner;

public class AlphabetCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'A' && ch<= 'Z') {
            System.out.println("Upper case");
        }else {

            System.out.println("Lower case");
        }
    }
}
