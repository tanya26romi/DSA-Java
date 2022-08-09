package Math.PrimeNumber;
import java.util.*;

public class GeneratePrimes_Sieve {
    public static void main(String[] args) {
        int n=100000000;
        boolean[] is_prime = new boolean[n+1];//start with index 0
        Arrays.fill(is_prime, true);

        is_prime[0]=false;
        is_prime[1]=false;

        for(int i=2;i<=n;i++){
            if(is_prime[i]==true){
                for(int t=i*i;t<=n;t++){
                    if(t%i==0)
                        is_prime[t]=false;
                }
            }
        }
        for(int i=0;i<=n;i++){
            if(is_prime[i]==true){
                System.out.print(i+" ");
            }
        }
    }
}
