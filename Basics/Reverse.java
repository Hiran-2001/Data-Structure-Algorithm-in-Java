package Basics;

import java.util.Scanner;

public class Reverse {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         

        System.out.println("enter numbers");
        long enteredNumber = sc.nextInt();
        long newNumbers = 0;
        while(enteredNumber > 0){
            long lastNumber = enteredNumber % 10;
    
            newNumbers = newNumbers * 10 +  lastNumber;
            enteredNumber /= 10;
        }
        System.out.println(newNumbers);
    }
}
