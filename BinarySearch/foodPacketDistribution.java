package BinarySearch;

public class foodPacketDistribution {

    public static boolean isValid(int[] A, int B, int population){
        int i=0;
        int prev=0;
        int n=A.length;
        int count=0;
        if(population==0){
            return true;
        }
        while(i<n){

            prev=(int) Math.ceil(A[i]/population);
            count+=prev;
            System.out.print("count ="+count+" A[i]="+A[i]);
            if(count>=B){
                return true;
            }
            System.out.print(" B ="+B);
            i++;
            System.out.println();
        }
        return false;
    }
    public static int solve(int[] A, int B) {
        int n=A.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min, A[i]);
        }
        int ans=0;
        int low=0;
        int high=min;
        
        while(low<=high){
            
            int mid=low+(high-low)/2;
            System.out.println("low="+low+" mid="+mid+" high="+high);
            if(isValid(A, B, mid)== true){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low-1;
    }

    public static void main(String[] args) {
        int[] A = {1,1,1 };
        int B=4;
        System.out.println(solve(A, B));
    }
}
