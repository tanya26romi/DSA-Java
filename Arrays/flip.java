package Arrays;

public class flip {
    public static void flip(String A) {
        int n=A.length();
        int[] count=new int[n];
        for(int i=0;i<n;i++){
            if(A.charAt(i)=='1'){
                count[i]=-1;
            }
            else{
                count[i]=1;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(count[i]+" ");
        }
        System.out.println();
        int sum=0;
        //int max_length=0, length=0;
        int best_start=-1,best_end=-1;
        int best_sum=0;
        int ptr=0;
        for(int i=0;i<n;i++){
            sum = sum+count[i];
            if(sum<0){
                sum=0;
                ptr=i+1;
            }
            if(sum>best_sum){
                best_sum=sum;
                best_start=ptr;
                best_end=i;
            }
        }

        System.out.println("best_start="+best_start+" best_end="+best_end);
        if(best_start==-1 && best_end==-1){
            int[] res=new int[0];
            System.out.println("Nothing");
            for(int i=0;i<res.length;i++){
                System.out.print(res[i]+" ");
            }
        }
        int[] res=new int[2];
        res[0]=best_start+1;
        res[1]=best_end+1;
        System.out.println("found");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args) {
        String A="1101010001";
        flip(A);
        // for(int i=0;i<2;i++){
        //     System.out.print(res[i]+" ");
        // }
    }
}
