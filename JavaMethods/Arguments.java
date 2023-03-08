package JavaMethods;

public class Arguments {
    public static void main(String[] args) {
        //    int ans = sum(25,50);
        //    System.out.println(ans);
        String message = greeting("Hello Sreekutty");
        System.out.println(message);
        }
    
        static int sum(int a,int b){
               return a + b;
        }
    
        static String greeting(String message){
               return message;
        }
}
