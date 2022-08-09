package BitManipulation;

public class DivideIntegers {
    public static int divide(int A, int B) {
        if(B==0){
            return A;
        }
        if(A==0){
            return 0;
        }
        if(B>A){
            return 0;
        }
        if(A==B){
            return 1;
        }
        long count=0;
        while(A>=B){
            A=A>>1;
            count++;
        }
        return (int)count;
        
        
        // 2147483647
        // 1

    }
    public static void main(String[] args) {
        int A=12;
        int B=2;

        System.out.println(divide(A,B));
    }
}
