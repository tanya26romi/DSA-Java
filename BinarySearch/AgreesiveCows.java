package BinarySearch;

public class AgreesiveCows {
    public static boolean isValid(int[] A, int cows, int dist){
        int i=1,prev=A[0];
        cows=cows-1;
        int n=A.length;
        while(cows>0){
            while(i<n && A[i]-prev<dist){
                i++;
            }
            if(i==n){
                return false;
            }
            
            cows=cows-1;
            prev=A[i];
            i++;
        }
        return true;
    }
    public static int solve(int[] A, int cows){
        int n=A.length;
        int low=1, high=A[n-1];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isValid(A, cows, mid)==true){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low-1;
    }
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int cows=3;
        int res=solve(A,cows);
        System.out.println(res);
    }    
}
