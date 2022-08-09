package DynamicProgramming;

public class DecodeWays {
    static int count=0;
    public static int solve(String s, int i, int n){
        if(i==n){
            return count+1;
        }
        System.out.println("i="+i+" n="+n+" s.charAt(i+1)="+s.charAt(i+1));
        if(s.charAt(i)=='0'){
            return 0;
        }
        // 10 - 26
        else if(i<n-2 && (s.charAt(i)=='1' && s.charAt(i+1)<='9') || (s.charAt(i)=='2' && s.charAt(i+1)<'7')){
            count++;
            return solve(s, i+2, n);
        }
        System.out.println("count="+count);
        return solve(s, i+1, n);
    }
    public static int numDecodings(String s) {
        int n = s.length();
        int res =  solve(s, 0, n);
        System.out.println("res= "+res);
        return res;
        //return count;
    }
    public static void main(String[] args) {
        String s = "12";
        System.out.println(numDecodings(s));
    }
}
