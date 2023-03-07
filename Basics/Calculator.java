package Basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the operator");
        char operator = sc.next().trim().charAt(0);
        int ans = 0;

        while (true) {
            if(operator == '+' || operator== '*' || operator == '-' || operator == '/'){
                System.out.println("Enter the First number:");
                int num1 = sc.nextInt();
                System.out.println("Enter the second number:");
                int num2 = sc.nextInt();
                if (operator == '+') {
                    ans = num1 + num2;
                }
                if (operator == '-') {
                    ans = num1 - num2;
                }
                if (operator == '*') {
                    ans = num1 * num2;
                }
                if (operator == '/') {
                   if (num2 == 0) {
                     System.out.println("cannot divide with 0");
                   }
                    ans = num1 / num2;
                }
     
             }else if(operator == 'X' || operator == 'x'){
                 break;
             }else{
                System.out.println("invalid operator");
                break;
             }
             System.out.println(ans);
        }
        
    }
}
