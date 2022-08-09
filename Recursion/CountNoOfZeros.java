package Recursion;

public class CountNoOfZeros {
    public static int count(int n){
        if(n<=0){
            return 0;
        }
        if(n%10==0){
            return count(n/10)+1;
        }
        return count(n/10);
    }
    public static void main(String[] args) {
        int n = 3020400;
        System.out.println(count(n));
    }
}
