import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);

      Scanner sc = new Scanner(System.in);

      for(int i = 0;i < 5;i++){

          list.add(sc.nextInt());
      }
      for(int i = 0;i< list.size();i++){
        System.out.println(list.get(i));
        System.out.println("size of the array" + " " +list.size());
      }

    }

}