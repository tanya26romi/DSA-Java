package Math.Combinatorics;

public class nCr_p {
    public static int fact(int n, int p){
        if(n==0 || n==1){
            return 1;
        }
        long fact =1;
        for(int i=1;i<=n;i++){
            fact = (long)((long)(fact)%p * (long)(i)%p)%p;
        }
        return (int)fact;
    }
    public static long bin_exp(int base, int power, int mod){
        if(power==0){
            return 1;
        }
        long x = bin_exp(base,power/2, mod);
        x=(x%mod*x%mod)%mod;
        if(power%2==0){
            return x;
        }
        else{
            return ((x%mod)*(base%mod)%mod);
        }
    }
    public static int solve(int A, int B, int C) {
        int n = A;
        int r = B;
        int p = C;
        int n_fact = fact(n, p);
        int nr_fact = fact(n-r, p);
        int r_fact = fact(r, p);

        //nCr  = n! * (((n-r)!)^-1) * ((n!)^-1) %p 
        long res = (long)((long)n_fact%p * (long)bin_exp(nr_fact, p-2,p)%p * (long)bin_exp(r_fact, p-2, p)%p)%p;
        return (int)res;
    }
    public static void main(String[] args) {
        int A=5;
        int B=2;
        int C=13;
        System.out.print(solve(A,B,C));
    }
}
