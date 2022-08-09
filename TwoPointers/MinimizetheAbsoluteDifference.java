package TwoPointers;

public class MinimizetheAbsoluteDifference {
    public static int solve(int[] A, int[] B, int[] C) {
        int p=A.length;
        int q=B.length;
        int r=C.length;
        int i=0,j=0,k=0;
        int res=Integer.MAX_VALUE;
        while(i<p && j<q && k<r){
            int min=Math.min(A[i], Math.min(B[j], C[k]));
            int max=Math.max(A[i], Math.max(B[j], C[k]));
            res=Math.min(res, Math.abs(min-max));
            System.out.println("max="+max+" min="+min+" res="+res);
            if(min == A[i]){
                i++;
            }
            else if(min==B[j]){
                j++;
            }
            else if(min==C[k]){
                k++;
            }

        }
        return res;
    }
    public static void main(String[] args) {
        int[] A = {1, 4, 5, 8, 10 };
        int[] B = {6, 9, 15};
        int[] C = {2, 3, 6, 6};
        System.out.println(solve(A, B, C));
    }
}
