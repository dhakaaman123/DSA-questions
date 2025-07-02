import java.util.*;
public class isomorphicString {

    public boolean isIsomorphic(String s, String t){
        int[] m1 = new int[256], m2 = new int[256];
        int n = s.length();
        if(n != t.length()){
            return false;
        }
        for(int i =0;i<n;i++){
            if(m1[s.charAt(i)] != m2[t.charAt(i)]){
                return false;
            }
            m1[s.charAt(i)] =i+1;
            m2[t.charAt(i)]=i+1;

        }
        return true;
        
    }
    public static void main(String[] args){
        isomorphicString iso = new isomorphicString();
        String s = "tag";
        String t = "dhan";
        boolean result = iso.isIsomorphic(s,t);
        if(result){
            System.out.println("The strings are isomorphic.");
        }
        else{
            System.out.println("The strings are not isomorphic.");
        }
    }
    
}
