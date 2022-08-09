package Recursion;

public class KthElement {
    public static int find(int row, int pos){
        if((row==2 && pos==1) || (row==1 && pos==1)){
            return 0;
        }
        if(row==2 && pos==2){
            return 1;
        }
        int temp=0;
        temp = find(row-1, (pos+1)/2);
        if(pos%2==0){
            temp = (temp+1)%2;
        }
        return temp;
    }
    public static int solve(int A, int B) {
        return find(A,B);
    }
    public static void main(String[] args) {
        int A=5;
        int B=12;
        System.out.println(solve(A, B));
    }
}
