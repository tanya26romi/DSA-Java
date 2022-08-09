package Arrays;

public class MinimumSwaps {
    public static int solve(int[] A, int B) {
        
        int n = A.length;
        if(n==1)
        {
            return 0;
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(A[i] <= B){
                count++;
            }
        }
        
        int min = Integer.MAX_VALUE;
        int i=0, j=0, temp_count=0;
        while(j<n){
        //     //count is window size
             if(A[j]<=B){
                    temp_count++;
             }
             //System.out.println("A[i] = "+A[i]+" A[j] = "+A[j]);
             if(j-i+1 == count){
                 min=Math.min(min, count-temp_count);
                 if(A[i]<=B){
                     temp_count--;
                 }
                 i++;
             }
             j++;
            
        }
        return min;
    }
    public static void main(String[] args) {
        int[] A = { 1,2, 6, 7, 8, 9, 5};
        int B=5;
        int res=solve(A,B);
        System.out.println(res);
    }
}
