package Recursion;

public class BinarySearch {
    public static int binSearch(int[] arr, int x, int s, int e){
        int mid = s+(e-s)/2;
        if(s>e){
            return -1;
        }
        if(arr[mid]==x){
            return mid;
        }
        if(arr[mid]>x){
            return binSearch(arr, x, s, mid-1);
        }
        
            return binSearch(arr, x, mid+1, e);
        
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,7,8,10,15,19};
        int x=110;
        System.out.println(binSearch(arr,x,0,arr.length));
    }
}
