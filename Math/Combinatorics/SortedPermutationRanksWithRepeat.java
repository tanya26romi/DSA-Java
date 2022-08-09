package Math.Combinatorics;
import java.util.*;
/**
 * SortedPermutationRanksWithRepeat
 */
public class SortedPermutationRanksWithRepeat {
    public static int findFact(int n, int mod){
        if(n==0 || n==1){
            return 1;
        }
        long fact=1;
        for(int i=1;i<=n;i++){
            fact=(fact%mod*i%mod)%mod;
        }
        return (int)fact;
    }
    public static long bin_exp(long base, long power, long mod){
        if(power==0){
            return 1;
        }
        long x = bin_exp(base, power/2, mod);
        x = (x%mod * x%mod)%mod;
        if(power%2==0){
            return x;
        }
        else{
            return (x%mod * base%mod)%mod;
        }
    }
    public static int findRank(String A) {
        int n = A.length();
        int mod=1000003;
        
        
        
        int res=0;
        
        for(int i=0;i<n;i++){
            int[] c = new int[52];
            for(int j=i;j<n;j++){
                char ch2=A.charAt(j);
                if(ch2>='a' && ch2<='z')
                    c[ch2-'a']++;
                else if(ch2>='A' && ch2<='Z')
                    c[ch2-'A'+26]++;
            }
            int count=0;
            for(int j=i+1;j<n;j++){
                if(A.charAt(i)>A.charAt(j)){
                    count++;
                }
            }
            
            for(int j=0;j<52;j++){
                System.out.print(c[j]+" ");
            }
            System.out.println();
            long ans=1;
            for(int j=0;j<52;j++){
                if(c[j]>1){
                    ans=ans*(long)(findFact(c[j], mod))%mod;
                    System.out.println("fact of c array="+ans);
                }
            }
            //System.out.println("fact of c array="+res);
            
            long fact=(long)findFact(A.length()-1-i, mod);
            long inverse = bin_exp(ans,mod-2,mod);
            res =(int)((res%mod) +  (count * fact * inverse)%mod);
            System.out.println("res="+res+" count="+count+" fact of rem="+fact);
            
            
           
            
            // System.out.println();
        }
        
        return res+1;
    }
    public static void main(String[] args) {
        String str = "asasdsdsadasdadsadasdsa";//Expected - 208526
        System.out.println(findRank(str));
    }
}