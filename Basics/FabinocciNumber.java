package Basics;

import java.util.Scanner;

public class FabinocciNumber {
    public static void main(String[] args) {                                                                                                                                                                                                               
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        int count = 2;

        while (count <= n) {
            int temp = secondNumber;
            secondNumber += firstNumber;                                                                                                                                                                                                                                                                       
            firstNumber = temp;
            System.out.println(firstNumber);
            count++;
        }
        // do {
        //     int temp = secondNumber;
        //     secondNumber += firstNumber;
        //     firstNumber = temp;
        //     System.out.println(secondNumber);
        //     count++;
        // } while (count <= n);
       
    }

}
