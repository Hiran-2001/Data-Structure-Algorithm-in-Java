package LeetCode;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {5,9,4,5,9};

        int result = findNumber(arr);
        System.out.println(result);
    }

    static int findNumber(int[] arr){
        int target = arr[0];
        int count = 0;
        int SingleNumber = 0;
       for(int first=0;first<arr.length;first++){
        for(int second=1;second<arr.length;second++){
            if(target != arr[second]){  
              SingleNumber = target;
            }else{

                SingleNumber = 0;
            }
        }

       }
       return SingleNumber;
      

      
    }
}
