package Sorting;

import java.util.*;
public class ChocolateDistribution {
    public static int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        Collections.sort(A);
        int min=Integer.MAX_VALUE;
        // for(int i=0;i<A.size();i++){
        //     System.out.print(A.get(i)+" ");
        // }
        for(int i=0;i<n-B-1;i++){
            min = Math.min(min, A.get(i+B-1)-A.get(i));
            System.out.println(A.get(i)+" "+A.get(i+B-1));
        }
        return min;
    }

    public static void main(String[] args) {
        int[] A = {3, 4, 1, 9, 56, 7, 9, 12};
        int B=5;
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<A.length;i++){
            list.add(A[i]);
        }
        System.out.println(solve(list, B));
    }
}
