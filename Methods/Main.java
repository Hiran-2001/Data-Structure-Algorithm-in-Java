package Methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //    int ans =  sum();
    //    System.out.println(ans);
    String message = greeting();
    System.out.println(message);
    }

    static int sum() {
        Scanner op = new Scanner(System.in);
        int num1 = op.nextInt();
        int num2 = op.nextInt();
        int sum = num1 + num2;
       return sum;
    }
    static String greeting(){
         String message = "Hello how are you";
        return message;
    }
}
