package Searching.LinearSearch;

import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a name");
        String name = input.next();
        System.out.println("Enter a letter to find from the name");
        char letter = input.next().charAt(0);

        boolean result = searchLetter(name, letter);
        System.out.println(result);

    }

    static boolean searchLetter(String name, char letter) {
        if (name.length() == 0) {
            return false;
        }
        for (int index = 0; index < name.length(); index++) {
         
                if (letter == name.charAt(index)) {
                    return true;
                }
            

        }
        return false;
    }

}
