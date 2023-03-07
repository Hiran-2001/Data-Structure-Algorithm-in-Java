package Methods;

public class methodOverloading {
    public static void main(String[] args) {
    //   int result1 =  fun(25, 50);
    //   System.out.println(result1);
      int result2 = fun(25,5,10);
      System.out.println(result2);
    }

    static int fun(int num, int num2){
        System.out.println("this takes 2 args");
        return num + num2;
    }
    static int fun(int num,int num2,int num3){
        System.out.println("this takes 3 args");
         return num * num2 - num3;
    }
}
