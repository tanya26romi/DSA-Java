package Sorting;
import java.util.*;
public class UniqueElements {
    public static int solve(ArrayList<Integer> A) {
        int n = A.size();
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hmap.containsKey(A.get(i))){
                hmap.put(A.get(i), hmap.get(A.get(i))+1);
            }
            else{
                hmap.put(A.get(i), 1);
            }
        }
        System.out.println(hmap);
        int res=0;
        for(int i=0;i<n;i++){
            int temp = A.get(i);
            int count= hmap.get(temp);
            if(count>1){
                while(hmap.containsKey(temp)){
                    res++;
                    temp++;
                }
                    hmap.put(A.get(i), hmap.get(A.get(i))-1);
                    hmap.put(temp, 1);
                    A.set(i,temp);
            }
        }

        return res;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        System.out.println(solve(list));
    }
}
