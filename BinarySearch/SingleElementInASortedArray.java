package BinarySearch;
public class SingleElementInASortedArray {
    public static int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid==0 || mid%2==1 && nums[mid-1]==nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(low>0)
        {
            return nums[low-1];
        }
        return nums[low];
    }
    public static void main(String[] args) {
        int[] A = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(A));
    }
}