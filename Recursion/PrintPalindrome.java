package Recursion;

public class PrintPalindrome {
    public static void palindrome(String str, int s, int e, StringBuffer res){
        if(s==e){ return; }
        palindrome(str, s+1, e, res);
        res.append(str.charAt(s));
    }
    public static void main(String[] args) {
        String str = "Hello Madam";
        StringBuffer sb = new StringBuffer();
        palindrome(str,0, str.length(),sb);
        System.out.println(sb);
    }
}
