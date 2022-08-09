package Recursion;

public class ReverseNumber {
    static int num=0;
    public static void printRev(int n){
        if(n<=0){
            return;
        }
        num = 10*num+n%10;
        //System.out.print("num = "+num);
        printRev(n/10);

    }
    public static void main(String[] args) {
        int n = 23456;
        printRev(n);
        System.out.println(num);
    }
}
