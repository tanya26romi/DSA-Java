package BitManipulation;

public class CountSetBits {
    //1000000000
    public boolean is_set_bit(int n, int k)
    {
        if(((n>>(k-1))&1) == 1)
            return true;
        return false;
    }
    public int solve(int A) {
        /*  
        0 0 0 1
        0 0 1 0
        0 0 1 1
        0 1 0 0
        0 1 0 1
        0 1 1 0
        0 1 1 1 - 7
        
          */
        int mod = 1000000007;
        long count=0;
        long red=0, yellow=0;
        for(int i=32;i>=1;i--)
        {
            if(is_set_bit(A, i)==true)
            {
                if(i==1)
                {
                    red=0;
                }
                else
                {
                    red = (long)((long)(i-1)*(long)(1<<(i-2)));
                }
                yellow = A - (1<<(i-1))+1;
                count = (long)(count%mod+(long)red%mod+(long)yellow%mod)%mod;
                A=A-(1<<(i-1));
                System.out.println("red="+red+" yellow="+yellow+" count="+count+" A="+A);
            }
            
        }
        return (int)count%mod;
    }

        public static void main(String[] args) {
            CountSetBits cset = new CountSetBits();
             int A=1000000000;
            //int A = 9;
            //expected- 846928043
            //my output- 962026246
            int res = cset.solve(A);
            System.out.println(res);
        }
}
// A : 1000000000
// Expected - 846928043
