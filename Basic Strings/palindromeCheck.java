import java.util.*;
public class palindromeCheck{
    public static void main(String[] args){
        palindromeCheck pc = new palindromeCheck();
        String s = "madam";
        if(pc.isPalindrome(s)){
            System.out.println(s + " is a palindrome");
        }
        else{
            System.out.println(s +" is not a palindrome");
        }


    }
    public static boolean isPalindrome(String s){
        int start =0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
