import java.util.*;
public class reverseString{
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of strings");
        int n = sc.nextInt();
        Vector<String> str = new Vector<String>();
        System.out.println("enter the strings");
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            str.add(s);

        }
        reverseString rs = new reverseString();
        rs.reverseString((str));
        System.out.println("reversed strings are:");
      for(String s:str){
        System.out.print(s);
      }



    }
    public void reverseString(Vector<String> str){
        int start =0; int end= str.size()-1;
        while(start<end){
            String temp = str.get(start);
            str.set(start,str.get(end));
            str.set(end,temp);
            start++;
            end--;
            

        }
        return;
    }
}