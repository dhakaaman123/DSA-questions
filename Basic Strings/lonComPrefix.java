import java.util.Arrays;
public class lonComPrefix {
    public String longestCommonPrefix(String[] str){
        StringBuilder sb = new StringBuilder();
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length-1];
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i) == last.charAt(i)){
                sb.append(first.charAt(i));

            }
            else{
                return sb.toString();
            }
        }
        return sb.toString();


    }

    public static void main(String[] args){
        lonComPrefix lcp  = new lonComPrefix();
        String[] str = {"flower","flow","flight"};
        String result = lcp.longestCommonPrefix(str);
        if(result.isEmpty()){
            System.out.println("There is no common prefix");
        }
        else{
            System.out.println("The longest common prefix is: " + result);
        }
    }
    
}
