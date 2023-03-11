package Searching.LinearSearch;

public class FindHowManyEven{
    public static void main(String[] args) {
        int[] arrOfNums = {489,65,6563,7852,63,1,36};

        int result = findNumbers(arrOfNums);
         
        System.out.println(result);
    
    }
            
    static int findNumbers(int[] nums){
        int count = 0;

        for(int index = 0 ; index < nums.length; index++){
            if(even(nums[index])){
                  count++;
            }
        }
        return count;
    }

    static boolean even(int nums){
         int noOfDigits = digits(nums);
         if(noOfDigits % 2 == 0){
            return true;
         }
         return false;
    }

    static int digits(int num){
           int count = 0 ;

           while(num > 0){
            count++;
            num /= 10;
           }
           return count;
    }
}