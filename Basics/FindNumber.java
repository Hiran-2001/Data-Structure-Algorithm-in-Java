package Basics;

import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the Numbers");
        long enterNumbers = sc.nextLong();
        System.out.println("Enter a number to find");
        int findNumber =sc.nextInt();

        while(enterNumbers > 0){
            long rem = enterNumbers % 10;
            if(rem==findNumber){
                System.out.println(rem + "is found in entered Numbers");
            }else{
                System.out.println("not found");
            }
            enterNumbers = enterNumbers/10;
            
        }

    }
}
