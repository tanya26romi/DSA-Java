package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumMinimum {

    public static ArrayList<Integer> solve(List<Integer> A) {
        int mod=1000000007;
        ArrayList<Integer> list = new ArrayList<>();
        Collections.sort(A);
        int n=A.size();
        for(int i=0;i<A.size();i++){
            System.out.print(A.get(i)+" ");
        }
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        for(int i=0;i<n/2;i++){
            l1.add(A.get(i));
        }
        for(int i=n/2;i<n;i++){
            l2.add(A.get(i));
        }

        int max=0;
        for(int i=0;i<l1.size();i++){
            max=(((max%mod)+mod)%mod + ((Math.abs(l1.get(i)-l2.get(i))%mod)+mod)%mod)%mod;
        }
        list.add(max);
        
        long min=0;
        System.out.println();
        for(int i=0;i<n-1;i+=2){
           // min=(((min%mod)+mod)%mod + ((Math.abs(A.get(i)-A.get(i+1))%mod)+mod)%mod);
           min=min+Math.abs(A.get(i)-A.get(i+1));
           System.out.print(Math.abs(A.get(i)-A.get(i+1))+" ");
        }
        min = ((min%mod)+mod)%mod;
        int m=(int)min;
        list.add(m);
        return list;
    }

    public static void main(String[] args) {
        int[] A = {-98, 54, -52, 15, 23, -97, 12, -64, 52, 85};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<A.length;i++){
            list.add(A[i]);
        }
        ArrayList<Integer> al=solve(list);
        System.out.println();
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
    }
}
