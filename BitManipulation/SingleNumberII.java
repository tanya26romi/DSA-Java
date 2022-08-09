package BitManipulation;

/**
 * SingleNumberII - Given an array of integers, every element appears thrice except for one, which occurs once.

Find that element that does not appear thrice.

 */
public class SingleNumberII {

    public static int set_bits(int n, int k)
    {
        int m = (n| (1<<(k-1)));
        //System.out.println("set bits = "+m);
        return m;
    }
    public static boolean is_set_bit(int n, int k)
    {
        if(((n>>(k-1))&1)==1)
        {
           // System.out.println("is_set_bit for "+n+" at bit k= "+k+" = "+true);
            return true;
        }
        //System.out.println("is_set_bit = "+false);
        return false;
    }
    public static void main(String[] args) {
        int[] A = { 629, 629, 133, 133, 133, 528, 629 };
        int ans=0;
        for(int i=1;i<32;i++)
        {
            int count=0;
            for(int j=0;j<A.length;j++)
            {
                //System.out.println(A[j]+" and "+i);
                if(is_set_bit(A[j],i)==true)
                {
                    count++;
                }
            }
            //System.out.println(count);
            if(count%3!=0)
            {
                ans = set_bits(ans,i);
            }
        }
        System.out.println(ans);
    }
    
}