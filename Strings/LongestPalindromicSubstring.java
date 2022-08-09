package Strings;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String A) {
        int n = A.length();
        int start=0,end=0;
        int max=0;
        int l=0,r=0;
        for(int i=0;i<n-1;i++){
           
            l=i-1;
            r=i+1;
            while(l>=0 && r<=n-1 && A.charAt(l)==A.charAt(r)){

                if(max<r-l+1){
                    max=r-l+1;
                    start=l;
                    end=r;
                }          
                l--;
                r++;
            }
            System.out.println("i="+i+" start="+start+" end="+end);
            System.out.println(A.substring(start, end+1));
        }
        for(int i=0;i<n-1;i++){
           
            l=i;
            r=i+1;
            while(l>=0 && r<=n-1 && A.charAt(l)==A.charAt(r)){

                if(max<r-l+1){
                    max=r-l+1;
                    start=l;
                    end=r;
                }          
                l--;
                r++;
            }
            System.out.println("i="+i+" start="+start+" end="+end);
            System.out.println(A.substring(start, end+1));
        }
        StringBuffer sb = new StringBuffer();
        for(int i=start;i<=end;i++)
        {
            sb.append(A.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "bb";//"aaaabaaa";
        System.out.println(longestPalindrome(str));
    }
}
