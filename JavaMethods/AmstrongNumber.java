package JavaMethods;

public class AmstrongNumber {
    public static void main(String[] args) {
        for(int i = 0;i<100;i++){
          if (isAmstrong(i)) {
              System.out.println(i);
          }
        }
     }
  
      static boolean isAmstrong(int number){
        int orignal = number;
        int sum =0;
        while(number > 0){
          int lastNumber = number % 10;
          number /= 10;
          sum = sum + lastNumber * lastNumber * lastNumber;
        }
        if(sum==orignal) return true;
        else return false ;
     }
}
