import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
         int count = 0;
        //  while (count != 5) {
        //     System.out.println(count);
        //     count++;
        //  }
  
        //  int num = 10
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number" );
        int num = sc.nextInt();
        for(count = 1; count <= num;count++){
            System.out.println(count);
        }
    }
}