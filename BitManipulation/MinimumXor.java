package BitManipulation;

/**
 * MinimumXor
 */
public class MinimumXor {

    public static boolean is_set_bit(int n, int k)
    {
        // if((n&(1<<(k-1))) == 0)
        //     return true;
        // return false;
        if(((n>>(k-1))&1) == 1)
            return true;
        return false;
    }
    public static int set_bit(int n, int k)
    {
        return n|(1<<(k-1));
    }
    public static int unset_bit(int n, int k)
    {
        return (n^((1<<(k-1))));
    }
    public int solve(int A, int B) {
        if(B==0)
            return 0;
        int a=A,ca=0;
        int b=B,cb=B;

        //count set bits in A
        while(a>0){
            ca++;
            a=(a&(a-1));
        }

        //preserve a and B
        a=A;
        b=B;
        System.out.println("a = "+a+" b = "+b);
        //sets bits is same in A and B
        if(ca==cb)
            return a;

        //set bits in A is greater - start unsetting bit from LSB till diff ==0
        else if(ca>cb){
            int diff = ca-cb;
            //System.out.println("diff when ca>cb = "+diff);
            //unset diff 
            for(int i=1;i<32;i++){
                if(diff==0)
                    break;
                boolean is_set = is_set_bit(a,i);
                //System.out.print("bool = "+ is_set);
                if(is_set==true){
                    a=unset_bit(a,i);
                    //System.out.print(" new_a "+a);
                    diff--;   
                }
                
            }
        }
        else if(cb>ca){
            int diff = cb-ca;
            //unset from left and at set bit of A
            
            for(int it=1;it<32;it++){
                if(diff==0)
                    break;
                boolean is_set=is_set_bit(a,it);
                if(is_set==false){
                    a=set_bit(a,it);
                    diff--;
                }
                
            }
        }

        return a;
    }

    public static void main(String[] args) {
        MinimumXor mxor = new MinimumXor();
        int n=3,m=2;
        int res = mxor.solve(n,m);
        System.out.println(res);
    }
}