package Recursion;

public class PalindromeCheck {
    static boolean res=true;
    public static boolean isCheck(String str, int s, int n){
        if(s>n){
            return true;
        }
        
        if(str.charAt(s)!=str.charAt(n)){
            return false;
        }
        return res= (isCheck(str, s+1, n-1) & res);
        
    }
    
    public static void main(String[] args) {
        String str = "123215";
        int n = str.length();
        boolean check = true;
        check = isCheck(str, 0, n-1);
        System.out.println(check);
    }
}
