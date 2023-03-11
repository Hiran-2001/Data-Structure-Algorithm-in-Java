package Searching.LinearSearch;

public class Wealth {
    public static void main(String[] args) {
        int[][] arr = {
            {12,8},
            {16,8},
            {5,9}
        };

        int result = WealthFinder(arr);
        System.out.println(result);
    }

    static int WealthFinder(int[][] accounts){
        int ans = 0;
        for(int person = 0;person<accounts.length;person++){
                 int sum = 0;
            for(int account = 0; account<accounts[person].length;account++){
                sum = sum + accounts[person][account];
            }
            if(ans < sum){

                ans = sum;
            }

        }
        return ans;
    }

}
