package TwoPointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ThreeSum {
    public static ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        int n = A.size();
        //ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        HashSet<ArrayList<Integer>> hset = new HashSet<>();
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=A.get(i)+A.get(j)+A.get(k);
                if(sum==0){
                    ArrayList<Integer> inner = new ArrayList<>();
                    inner.add(A.get(i));
                    inner.add(A.get(j));
                    inner.add(A.get(k));
                    Collections.sort(inner);
                    hset.add(new ArrayList<>(inner));
                    j++;
                    k--;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(hset);
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1, -4, 0, 0, 5, -5, 1, 0, -2, 4, -4, 1, -1, -4, 3, 4, -1, -1, -3 };
        int n=arr.length;
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0;i<n;i++){
            A.add(arr[i]);
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Collections.sort(A);
        list=threeSum(A);
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(0).size();j++){
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
