package BinarySearch;
public class AllocateBooks {

    public static boolean isValid(int[] A, int B, int pages){
        int n=A.length;
        int i=0;
        int prev=0;
        while(B>0){
            prev=0;
            while(i<n && A[i]+prev<=pages){
                prev+=A[i];
                i++;
            }
            if(i==n){
                return true;
            }
            B=B-1;
        }
        return false;
    }
    public static int books(int[] A, int B) {
        int n=A.length;
        int low=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=A[i];
        }
        int high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            System.out.println("mid="+mid);
            if(isValid(A,B,mid)==false){
                low=mid+1;;
            }
            else{//true then ar kam pages ka try kro
                high=mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] A = {12, 34, 67, 90};
        int B=2;
        System.out.println(books(A,B));
    }
}
