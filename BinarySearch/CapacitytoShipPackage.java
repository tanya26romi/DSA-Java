package BinarySearch;

public class CapacitytoShipPackage {
    public static boolean isValid(int[] A, int days, int W){
        int i=0;
        int prev=0;
        int n=A.length;
        while(days>0){
            prev=0;
            while(i<n && A[i]+prev<W){
                prev+=A[i];
                i++;
            }
            if(i==n){
                return true;
            }
            days--;
        }
        return false;
    }
    public static int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int low=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=weights[i];
        }
        int high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            System.out.println(mid);
            if(isValid(weights, days, mid)==false){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low-1;
    }
    public static void main(String[] args) {
        int[] A= {1,2,3,4,5,6,7,8,9,10};
        int B=5;
        System.out.println(shipWithinDays(A, B));
    }
}
