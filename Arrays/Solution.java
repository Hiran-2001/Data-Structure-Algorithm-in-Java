import java.util.Arrays;

class Solution {
    public static void main(String[]args){
      int[] nums = {3,2,4};
      int target =6;
      int[] result = twoSum(nums,target);
      System.out.println(Arrays.toString(result));
     
    }
    static int[] twoSum(int[] nums, int target) {
    
        for(int i = 0; i<nums.length;i++){
            for(int j = 1; j<nums.length;j++){
                if(target == nums[i]+nums[j]){
                   int[] sum = {i,j};
                    return sum;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
