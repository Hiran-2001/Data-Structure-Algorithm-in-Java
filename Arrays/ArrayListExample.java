import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(5);
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(45);

        System.out.println(list);
    }
}
