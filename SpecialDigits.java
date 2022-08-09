import java.util.ArrayList;

class Pair{
    int a;
    int b;
    long sum;
    public Pair(int a, int b, long sum){
        this.a=a;
        this.b=b;
        this.sum=sum;
    }
}

class SpecialDigits {
    
    public static int findFact(int N, int mod){
        long fact=1;
        for(int i=1;i<=N;i++){
            fact=(fact%mod*(long)(i)%mod)%mod;
        }
        return (int)fact%mod;
    }
    
    public static long bin_exp(int base, int power, int mod){
        if(power==0){
            return 1;
        }
        
        long x = bin_exp(base, power/2, mod);
        x=((long)x%mod * (long)x%mod)%mod;
        
        if(power%2==0){
            return x%mod;
        }
        else{
            return (x%mod * base%mod)%mod;
        }
    }
    
    public static int bestNumbers(int N, int A, int B, int C, int D) {
        // code here
        int mod=1000000007;
        long ans=0;
        ArrayList<Pair> list = new ArrayList<>();
        for(int i=0;i<=N;i++){
            int a=i;
            int b=N-i;
            long aa=(long)((long)a*(long)A);
            long bb=(long)((long)b*(long)B);
            System.out.println("At i="+i);
            long sum=aa+bb;
            System.out.println("aa="+aa+" bb="+bb+" sum"+sum);
            list.add(new Pair(a, b, sum));
        }
        for(int i=0;i<list.size();i++){
            Pair p =list.get(i);
            System.out.println(p.a+" "+p.b+" "+p.sum);
        }
        System.out.println();
        ArrayList<Pair> arr = new ArrayList<>();
        for(int i=0;i<=N;i++){
            Pair p=list.get(i);
            System.out.print("At i="+i+" ");
            //System.out.println(" "+p.a+" "+p.b+" "+p.sum);
            long digitsum=p.sum;
            
            
            while(digitsum>0){
                long d=10;
                int rem=(int) (digitsum%d);
                if(rem!=C && rem!=D){
                    break;
                }
                digitsum=digitsum/10;
                if(digitsum==0){
                    System.out.println(" "+p.a+" "+p.b+" "+p.sum);
                    arr.add(new Pair(p.a, p.b, p.sum));
                }
            }
            
        }
        
        System.out.println();
        for(int i=0;i<arr.size();i++){
            Pair p =arr.get(i);
            System.out.println(p.a+" "+p.b+" "+p.sum);
        }
        System.out.println();
        int n_fact=findFact(N, mod);
        
        for(int i=0;i<arr.size();i++){
            Pair p=arr.get(i);
            long aa=findFact(p.a, mod);
            long bb=findFact(p.b, mod);
            System.out.println("a="+p.a+" aa="+aa+" b="+p.b+" bb="+bb);
            ans=ans%mod + ((n_fact)/(aa*bb))%mod;
            
        }
        return (int)ans%mod;
    }
    public static void main(String[] args) {
        System.out.println(bestNumbers(7, 1, 6, 2, 6));
    }
}


