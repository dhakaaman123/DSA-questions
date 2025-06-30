import java.util.*;
public class largestOddNum{
    public String largesdOddNum(String s){
        int ind = -1;
        int i;
        for(i=s.length()-1;i>=0;i--){
            if((s.charAt(i)-'0')%2 !=0){
                ind =i;
                break;

            }

        }
        if(ind==-1){
            return "";
        }
        i=0;
        while(i<=ind && s.charAt(i)=='0'){
            i++;

        }
        return s.substring(i, ind+1);

    }
    public static void main(String[] args){
    largestOddNum n = new largestOddNum();
        String s = "98237412349873514";
        String result = n.largesdOddNum(s);
        System.out.println("largest odd number in the string is:" + result);


    }
    
}
