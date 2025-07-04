import java.util.*;
public class sortCharFreq {
    public List<Character> frequencySort(String s){
        Pair [] freq = new Pair[26];
        for(int i =0;i<26;i++){
            freq[i] = new Pair(0,(char)(i +'a'));
        }
        for(char c : s.toCharArray()){
            freq[c -'a'].freq++;
        }
        Arrays.sort(freq,(p1,p2)->{
            if(p1.freq != p2.freq){
                return p2.freq - p1.freq;
            }
            else{
                return p1.c-p2.c;
            }
        });

        List<Character> result = new ArrayList<>();
        for(Pair p:freq){
            if(p.freq>0){
                result.add(p.c);
            }
        }
        return result;


    }
    class Pair{
        char c;
        int freq;
        Pair( int freq, char c){
            this.c =c;
            this.freq = freq;

        }
    }
    public static void main(String[] args){
        sortCharFreq scf = new sortCharFreq();
        String s = "tree";
        List<Character> result = scf.frequencySort(s);
        System.out.println("Characters sorted by frequency: " + result);
    }

    
    
}
