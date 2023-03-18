package Searching.BinarySearch;

public class SmallersLetter {
    public static void main(String[] args) {
        char [] letters = {'a','e','i','o','u'};
        char target = 'o'; 
        char result = LetterSearch(letters,target);
        System.out.println(result);
    }

    static char LetterSearch(char [] letters, char target){
        int start =0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start +(end-start)/2;
            if(target < letters[mid]){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
