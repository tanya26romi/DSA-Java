package Math.PrimeNumber;

import java.util.*;
public class CountOfDivisors {
    public static void createSPFArray(int[] A, int[] spf, int max){
        for(int i=0;i<=max;i++){
            spf[i]=i;
        }
        
        for(int i=2;i<=max;i++){
            if(spf[i]==i){
                for(int j=i*i;j<=max;j++){
                    if(j%i==0){
                        spf[j]=Math.min(spf[j],i);
                    }
                }
            }
        }
    }

    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] A = {  2, 3, 4, 5 };//
        int n = A.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<A[i]){
                max=A[i];
            }
        }
        int[] spf = new int[max+1];

        createSPFArray(A, spf, max);
        int[] count = new int[n];
        for(int i=0;i<n;i++){
            int curr = A[i];
            int temp=1;
            HashMap<Integer, Integer> hmap = new HashMap<>();
            while(curr>0){
                if(curr==1){
                    break;
                }
                if(hmap.containsKey(spf[curr])){
                    hmap.put(spf[curr], hmap.get(spf[curr])+1);
                }
                else{
                    hmap.put(spf[curr], 1);
                }
                curr/=spf[curr];
            }
            //iterate
            for(Map.Entry<Integer, Integer> map:hmap.entrySet()){
                int temp1=0;
                temp1=map.getValue();
                temp*=(temp1+1);
            }
            count[i]=temp;
        }

        display(count);

        
    }
    
}
