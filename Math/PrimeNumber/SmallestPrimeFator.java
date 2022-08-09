package Math.PrimeNumber;

/**
 * SmallestPrimeFator
 */
public class SmallestPrimeFator {

    public static void main(String[] args) {
        int[] A = { 77, 41, 32, 17, 11, 34 };
        int n = A.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<A[i]){
                max=A[i];
            }
        }
        int[] spf = new int[max+1];
        for(int i=0;i<=max;i++){
            spf[i]=i;
        }
        for(int i=2;i<=max;i++){
            if(spf[i]==i){
                for(int j=i*i;j<=max;j++){
                    if(j%i==0)
                        spf[j]=Math.min(spf[j], i);
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(spf[A[i]]+" ");
        }
    }
}