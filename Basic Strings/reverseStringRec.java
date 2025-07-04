import java.util.ArrayList;
public class reverseStringRec {
    public ArrayList<Character> reverseString(ArrayList<Character> s){
        int left =0;
        int right = s.size()-1;
        reverseHelper(s,left,right);
        return s;
    }
    private void reverseHelper(ArrayList<Character> s, int left, int right){
        if(left >= right){
            return;
        }
        char temp = s.get(left);
        s.set(left, s.get(right));
        s.set(right, temp);
        reverseHelper(s, left+1, right-1);

    }

    public static void main(String[] args){
        reverseStringRec rsr = new reverseStringRec();
        ArrayList<Character> s =  new ArrayList<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');
        ArrayList<Character> result = rsr.reverseString(s);
        System.out.println("Reversed string: " + result);
    }
    
}
