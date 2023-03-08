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
   
       Scanner sc = new Scanner(System.in);
       System.out.println("enter five numbers");
       for (int i = 0; i < arr.length; i++) {
          arr[i] = sc.nextInt();
       }
        
    //    for(int j = 0 ; j< arr.length;j++){
    //     System.out.println(arr[j]);
    //    }
    System.out.println(Arrays.toString(arr));
    }
}
