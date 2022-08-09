package Recursion;

public class factorial {
    public static int printFact(int n){
        if(n<=1){
            return n;
        }
        return n*printFact(n-1);
    }
    public static void main(String[] args) {
        int n =5;
        int fact=1;
        fact = printFact(n);
        System.out.println(fact);
    }
}
