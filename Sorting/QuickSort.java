package Sorting;

public class QuickSort {
    public static void quickSort(int[] A, int start, int end){
        if(start>end){
            return;
        }
        // System.out.println("start = "+start+" end = "+end);
        int i = partition(A, start, end);
        // for(int t=0;t<=i;t++){
        //     System.out.print(A[t]+" ");
        // }
        // System.out.println();
        quickSort(A, start, i-1);
        quickSort(A, i+1, end);
    }
    public static int partition(int[] A, int start, int end){
        int p=A[start];
        // System.out.print("Partition");
        // System.out.println("start = "+start+" end = "+end);
        int last=end;
        while(start<=last && end>=0){
            if(A[start]>=p && A[end]<p){
                int temp = A[start];
                A[start]=A[end];
                A[end]=temp;
                start++;
                end--;
            }
            else if(A[start]<p){
                start++;
            }
            else if(A[end]>=p){
                end--;
            }
            else{
                start++;
                end--;
            }
            // for(int t=start;t<=end;t++){
            //     System.out.print(A[t]+" ");
            // }
            // System.out.println();
        }
        
       
        return start;
    }
    public static void main(String[] args) {
        int[] A = {10,7,9,-4,6,3,12,1,5,4,-13};
        int start=0, end=A.length-1;
        quickSort(A, start, end);
        for(int t=0;t<A.length;t++){
            System.out.print(A[t]+" ");
        }
    }
}
