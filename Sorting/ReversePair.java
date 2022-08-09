package Sorting;

public class ReversePair {
    public static int merge_sort(int[] A, int s, int e, int res){
        if(s>=e){
            return 0;
        }
        int mid=s+(e-s)/2;
        res= merge_sort(A, s, mid, res);
        res += merge_sort(A, mid+1, e, res);
        res += merge(A, s, mid, e, res);
        return res;
    }

    public static int merge(int[] A, int s, int mid, int e, int res){
        int[] C = new int[e-s+1];
        int i=s;
        int j=mid+1;
        int idx=0;
        
        idx=0;
        while(i<=mid && j<=e){
            if(A[i]<=A[j]){
                C[idx++]=A[i++];
            }
            else{
                if(A[i]>2*A[j]){
                    res+=mid-i+1;
                }
                C[idx++]=A[j++];
            }
        }
        while(i<=mid){
            C[idx++]=A[i++];
        }
        while(j<=e){
            C[idx++]=A[j++];
        }

        idx=0;
        for(int t=s;t<=e;t++){
            A[t]=C[idx++];
        }
        // for(int t=s;t<=e;t++){
        //     System.out.print(A[t]+" ");
        // }
        // System.out.println();
        return res;
    }
    public static int solve(int[] A) {
        int n=A.length;
        int res=0;
        merge_sort(A, 0, n, res);
        return res;
    }
    
    public static void main(String[] args) {
        int[] A= {1,3,2,3,1};
        int ans=solve(A);
        System.out.println("======");
        for(int t=0;t<A.length;t++){
            System.out.print(A[t]+" ");
        }
        System.out.println("Final Output"+ans);
    }
}
//git config –global user.name “tanya26romi”