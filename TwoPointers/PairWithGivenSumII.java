package TwoPointers;

public class PairWithGivenSumII {
    public static int solve(int[] A, int B) {
        int n=A.length;
        int mod=1000000007;
        int i=0,j=n-1;
        int sum=0;
        long count=0;
        while(i<j){
            sum=A[i]+A[j];
            
            if(sum==B){
                count++;
                int icount=0;
                //add if(A[i]==A[j])
                int ii=i, jj=j;
                while(ii<jj && A[ii]==A[ii+1]){
                    icount++;
                    ii++;
                }
                int jcount=0;
                while(jj>ii && A[jj]==A[jj-1]){
                    jcount++;
                    jj--;
                }
                count += (long)((long)count * (long)jcount)%mod;
                i++;
                j--;
            }
            else if(sum>B){
                j--;
            }
            else{
                i++;
            }
            
        }
        return (int)count;
    }
    public static void main(String[] args) {
        int[] A = {1,1,1,0,1,1,1 };
        int B=2;
        System.out.println(solve(A, B));
    }
}
