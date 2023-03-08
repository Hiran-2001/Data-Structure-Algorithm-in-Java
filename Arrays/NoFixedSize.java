import java.util.Scanner;

public class NoFixedSize {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];

        Scanner input = new Scanner(System.in);

        for(int row= 0; row<arr.length;row++){
            for(int col=0;col<arr.length;col++){
                arr[row][col] = input.nextInt();

            }
        }

        //output

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
         System.out.println();
        }
    }
}
