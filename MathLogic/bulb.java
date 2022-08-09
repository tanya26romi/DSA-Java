package MathLogic;

public class bulb {
    public static int bulbs(int[] A) {
        int n = A.length;
        int count=0;
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(A[i]==0 && flag==false){
                count++;
                flag=true;
            }
            if(A[i]==1 && flag==true){
                count++;
                flag=false;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] A = { 0, 1, 0, 1 };
        System.out.println(bulbs(A));
    }
}
