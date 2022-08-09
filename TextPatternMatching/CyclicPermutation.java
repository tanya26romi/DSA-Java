package TextPatternMatching;

public class CyclicPermutation {
    public static int solve(String A, String B) {
        int n=A.length();
        
        String s = A + "$"+ B + B;
        System.out.println(s);
        int[] LPS = new int[s.length()];
        LPS[0]=0;
        for(int i=1;i<s.length();i++){
            int x=LPS[i-1];
            while(s.charAt(i)!=s.charAt(x)){
                if(x==0){
                    x=-1;
                    break;
                }
                x=LPS[x-1];
            }
            LPS[i]=x+1;
            System.out.print(LPS[i]+" ");
        }
        int count=0;
        for(int i=0;i<s.length();i++){
            if(LPS[i]==n){
                count++;
            }
        }
        System.out.println();
        if(A.equals(B)){
            return count-1;
        }
        return count;
    }
    public static void main(String[] args) {
        String A="111";//"0011000010";
        String B="111";//"0101000001";
        System.out.println(solve(A,B));
    }
}
