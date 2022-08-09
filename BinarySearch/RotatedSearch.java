package BinarySearch;
public class RotatedSearch {
    public static int bin_exp(int[] A, int low, int high){
        while(low<=high){
            int mid = low + (high-low)/2;
            if(A[mid]>=A[high]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(low>0){
            return low-1;
        }
        return low;
    }
    public static int search(final int[] A, int B) {
        int n = A.length;
        int r = bin_exp(A, 0, n-1);
        int low=0,high=n-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            int new_mid = (mid+r)%n;
            if(A[new_mid]<=B){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        int index = low-1;
        index=(index+r)%n;

        if(index>=0 && A[index]==B)
            return index;

        return -1;
    }
    public static void main(String[] args) {
        int[] A= {1, 7, 67, 133, 178};
        int B=1;
        System.out.println(search(A, B));
    }
}
