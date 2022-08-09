package BitManipulation;

public class DivideTwoInteger {
    public static int divide(long dividend, long divisor) {
        int count=0;
        
        System.out.println("dividend="+Math.abs(dividend)+" divisor="+Math.abs(divisor)+" count"+count);
        while(Math.abs(dividend)>=Math.abs(divisor)){
            long a  = dividend;
            long b = divisor;
            while(Math.abs(a)>=Math.abs(b)){
                count++;
                b=b<<1;
            }
            System.out.println("a="+a+" b="+b+" count"+count);
            b=b>>1;
            a=Math.abs(a)-Math.abs(b);
            b=divisor;
            dividend=a;
            System.out.println("dividend="+dividend+" divisor="+divisor+" count"+count);
        }
        
        if(dividend<0 && divisor>0 && dividend>0 && divisor<0){
            return -1*count;
        }
        return count;
    }
    public static void main(String[] args) {
        long a=-2147483648, b=-1;
        System.out.println(divide(a,b));
    }
}
