package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class GrayCode {
    public static void solve(List<Integer> list, HashSet<Integer> hset, int start, int n){
        if(hset.contains(start)){
            return;
        }
        if(!hset.contains(start)){
            hset.add(start);
            list.add(start);
        }
        
        for(int i=0;i<n;i++){
            int temp =start^(1<<i);
            solve(list, hset, temp, n);
        }
    }
    public static List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> hset = new HashSet<>();
        int end = (int)Math.pow(2,n) - 1;
        solve(list, hset, 0, n);
        return list;
    }
    public static void main(String[] args) {
        int n=3;
        List<Integer> list = new ArrayList<>();
        list=grayCode(n);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
    }
}
