import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int [] arr = new int[5];

        // arr[0]= 2;
        // arr[1]= 22;
        // arr[2]= 222;
        // arr[3]= 2222;
        // arr[4]= 22222;

        // arr[2] = 999;
   
       Scanner sc = new Scanner(System.in); // here we re using scanner class to get user input.

       System.out.println("enter five numbers");

       for (int i = 0; i < arr.length; i++) {  // Here the loop will work till the varible 'i' less than length of the array ie 5. 5 is the size of the array.
          arr[i] = sc.nextInt();             //  here using scanner class we are taking user input and storing in that to array . arr[i] means arr[0]; 0 index; arr[1] first index
       }
        
    //    for(int j = 0 ; j< arr.length;j++){
    //     System.out.println(arr[j]);
    //    }
    System.out.println(Arrays.toString(arr));
    }
}
