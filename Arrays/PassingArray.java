import java.util.Arrays;

public class PassingArray{
    public static void main(String[] args) {
        int[] numbers = {45,66,323,78};
        System.out.println(Arrays.toString(numbers));

        change(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    static void change(int[]nums){
        nums[0] = 369;
    }
}