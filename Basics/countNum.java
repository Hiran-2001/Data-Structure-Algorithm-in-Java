package Basics;

import java.util.Scanner;

public class countNum {
    public static void main(String[] args) {
        // first we take an input
        // then we check the last number matches the user enter or not
        // initailly we made variable a named it count and this count will tell how many
        // time there the number is.
        // to check the last number we divide the number with 10 and the last number
        // will be the remainder and we store that remainder to a variable
        // then we check if the remainder matches with the user input we ll increment
        // the count,

        // userInput :
        // enteredNumber :
        // count = 0 :
        // while(userInput == 0)
        // int rem = userInput % 10
        // if(rem == userInput)
        // count++

        // then
        // enteredNumber /= 10
        // print(count)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        long enteredNumber = sc.nextInt();
        System.out.println("Enter to match");
        int userInput = sc.nextInt();
        int count = 0;
        while (enteredNumber > 0) {
            long rem = enteredNumber % 10;
            if (rem == userInput) {
                count++;
            }
            enteredNumber = enteredNumber/ 10;
        }
        System.out.println(count);
    }
}
