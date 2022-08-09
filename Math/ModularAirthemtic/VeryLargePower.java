package Math.ModularAirthemtic;

/**
 * VeryLargePower
 */
public class VeryLargePower {
    public static long bin_exp(int base, int power, int mod){
        if(power==0){
            return 1;
        }
        long x = bin_exp(base,power/2,mod);
        x = (x%mod * x%mod)%mod;
        if(power%2==0){
            return x;
        }
        else
            return ((x%mod)*(base%mod))%mod;
        
    }
    public static long exp(int base, int power, int B, int mod){
        long mul=1;
        while(power<=B){
            mul = (bin_exp(base,power,mod)%mod)%mod;
            base=(int)mul;
            //System.out.println("base = "+base+" power = "+power);
            power++;
            
        }
        return mul;
    }
    public static int solve(int A, int B) {
        // A^B! %mod = (A%mod)^B
        int mod = 1000000007;
        //System.out.println("base = "+A+" power = "+B);
        long res = exp(A,1,B,mod);
        return (int)res;
    }
    public static void main(String[] args) {
        int A= 110361;
        int B= 98772;
        System.out.println(solve(A,B));
    }
    
}