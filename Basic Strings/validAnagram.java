import java.util.Arrays;
public class validAnagram {
    public boolean isAnagram(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        int [] count  = new int[26];
        for(char c: s.toCharArray()){
            count[c -'a']++;
        }
        for(char c:t.toCharArray()){
            count[c -'a']--;
        }
        for(int i:count){
            if(i !=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        validAnagram va = new validAnagram();
        String s = "anagram";
        String t = "nagaram";
        boolean result = va.isAnagram(s,t);
        if(result){
            System.out.println("The strings are anagrams.");
        }
        else{
            System.out.println("The strings are not anagrams.");
        }
    }
}