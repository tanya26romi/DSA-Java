package Recursion;

public class Main {
    public static void main(String[] args) {
        int a=10000;
        message(0, a);
    }
    static void message(int count, int a){
        if(count==a)
            return;
        message(count+1,a);
        System.out.println("Hello World");
    }
}
