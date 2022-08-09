package Stack;
import java.util.*;

public class NextGreaterElementII {

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res,-1);
        Stack<Integer> stk = new Stack<>();
        
        for(int i=0;i<(2*n)-1;i++)
        {
            // 1 2 3 4 3
            i = i % n;
            
            while(!stk.isEmpty() && nums[i]>nums[stk.peek()])
            {
                int temp = stk.pop();
                res[temp]=nums[i];
            }
            
            stk.push(i);  
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3};

        int[] res= nextGreaterElements(nums);
        
        for(int i:res)
        {
            System.out.print(res[i]+" ");
        }
        
    }
}
