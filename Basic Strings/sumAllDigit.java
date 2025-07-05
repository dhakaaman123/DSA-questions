public class sumAllDigit {
    public static void main(String[] args){
        sumAllDigit sad = new sumAllDigit();
        int n = 345;
        int sum  = sad.sumDigit(n);
        System.out.println("The sum of digits in " + n + " is: " + sum);
    }
    public int sumDigit(int n){
        if(n<10){
            return n;
        }
        else{
            return sumDigit(sumd(n));
        }
    }
    public int sumd(int n){
        if(n==0){
            return 0;
        }
        else{
            return n%10 + sumd(n/10);
        }
    }
    
}
