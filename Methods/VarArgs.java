package Methods;

import java.util.Arrays;

public class VarArgs {
   public static void main(String[] args) {
      fun(46,665,54,65,646,89,66,1521,9,563,4,33,9,49,3654);
   }
   static void fun(int...arr){
    
    System.out.println(Arrays.toString(arr));
   }
}