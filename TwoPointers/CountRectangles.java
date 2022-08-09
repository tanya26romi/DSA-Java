package TwoPointers;

public class CountRectangles {
    public static int solve(int[] A, int B) {
        int n=A.length;
        int count=0;
        int i=0,j=1;
        while(i<n){
            long mul=(long)((long)A[i]*(long)A[j]);
            System.out.print("A[i]="+A[i]+" A[j]="+A[j]+" mul="+mul);
            if(mul<(long)B){
                count+=2;
                j++;
            }
            else{
                i++;
                j=i+1;
            }
            
            System.out.println(" count="+count);
            //System.out.println();
        }
        for(int t=0;t<n;t++){
            if(A[t]*A[t]<B){
                count+=1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] A = {1, 4, 10, 11, 12, 17, 19, 22, 25, 27, 41, 44, 52, 60, 63, 69, 122, 128, 132, 133, 139, 143, 147, 148, 149, 157, 164, 170, 172, 180, 192, 201, 202, 210, 213, 221, 224, 237, 238, 261, 265, 276, 281, 282, 288, 310, 311, 317, 320, 340, 351, 363, 373, 374, 375, 376, 385, 401, 412, 417, 429, 443, 446, 456, 461, 484, 488, 493, 497 };
        int B=977;
        System.out.println(solve(A, B));
    }
}
