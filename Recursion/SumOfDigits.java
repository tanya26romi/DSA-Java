package Recursion;

public class SumOfDigits {
    public static int findDigitSum(int n){
        if(n==0){
            return 0;
        }
        return findDigitSum(n/10)+(n%10);
    }
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(findDigitSum(n));
    }
}
