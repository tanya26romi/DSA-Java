package Recursion;

public class fibonacci {
    public static int fib(int n) {
        if(n<2){
            return n;
        }
        
        
        int res = fib(n-1)+fib(n-2);
        return res;
       
    }
    public static void main(String[] args) {
        //find nth fib number also print series
        int n=7;
        int res = fib(n);
        System.out.println(res);
    }
}
