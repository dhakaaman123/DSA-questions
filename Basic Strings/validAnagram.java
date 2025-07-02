import java.util.Arrays;
public class validAnagram {
    public boolean isAnagram(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray,tArray);
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