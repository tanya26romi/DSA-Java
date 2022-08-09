package Stack;
import java.util.*;
public class DailyTemperature {

    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stk = new Stack<>();
        int n=temperatures.length;
        int[] res = new int[n];
        for(int i=0;i<n;i++)
        {
            while(!stk.isEmpty() && temperatures[i]>temperatures[stk.peek()])
            {
                int temp=stk.pop();
                res[temp]=i-temp;
            }
            stk.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] temperatures = {89,62,70,58,47,47,46,76,100,70};

        int[] res= dailyTemperatures(temperatures);
        System.out.print("Given Temperatures: ");
        for(int i:res)
        {
            System.out.print(temperatures[i]+" ");
        }
        System.out.println();
        System.out.print("Warmers days are: ");
        for(int i:res)
        {
            System.out.print(res[i]+" ");
        }

    }
}
