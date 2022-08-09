package Sorting;

public class MaxMod {
    public static int solve(int[] A) {
        int n = A.length;
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(max1<A[i]){
                max2=max1;
                max1=A[i];
            }
            else if(max2<max1 && max2<A[i] && max1!=A[i]){
                max2=A[i];
            }
            System.out.println("max1="+max1+"max2="+max2);
        }
        System.out.println("max1="+max1+"max2="+max2);
        return max2%max1;
    }
    public static void main(String[] args) {
        int[] A = {3,3,3,3};
        System.out.println(solve(A));
    }
}
