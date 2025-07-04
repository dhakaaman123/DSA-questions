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
       return isPalindrome(s,0,s.length()-1);
    }

    private  static boolean isPalindrome(String s,int left, int right){
        if(left>=right){
            return true;
        }
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        return isPalindrome(s,left+1,right-1);
    }
}
