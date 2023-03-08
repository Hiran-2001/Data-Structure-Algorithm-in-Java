public class FindMaxValue {
    public static void main(String[] args) {
        int[] arr = {11,2,536,21,7,81,72};
        int result = max(arr);
        System.out.println(result);
    }

    static int max(int[] arr) {
        int max = 0;
        for(int i=0;i < arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
