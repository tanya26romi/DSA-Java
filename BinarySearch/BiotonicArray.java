package BinarySearch;

public class BiotonicArray {

    public static int search1(int[] A, int B, int s, int e){
        int n = A.length;
        int low=s;
        int high=e;
        System.out.println("low ="+low+" high ="+high);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(A[mid]<=B){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            System.out.print(" mid="+A[mid]);
        }
        
        if(low>0 && A[low-1]==B){
                return low-1;
        }
        return -1;
    }
    public static int search2(int[] A, int B, int s, int e){
        int n = A.length;
        int low=s;
        int high=e;
        System.out.println("low ="+low+" high ="+high);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(A[mid]>=B){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            System.out.print(" mid="+A[mid]);
        }
        
        if(low>0 && A[low-1]==B){
                return low-1;
        }
        return -1;
    }
    public static int solve(int[] A, int B) {
        int n = A.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid<n-1 && A[mid]<A[mid+1])
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println("Peak Point ="+A[low]);
        int point=low;
        int s1 = search1(A,B,0,point);
        int s2 = search2(A,B,point,n-1);
        System.out.println(/*"s1 ="+s1+*/"\n s2 ="+s2);
        if(s1 ==-1 && s2==-1){
            return -1;
        }
        if(s1!=-1){
            return s1;
        }
        return s2;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11};
        int B=12;
        System.out.println(solve(A,B));
    }
}
