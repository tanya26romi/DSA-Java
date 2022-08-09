package Sorting;

import java.util.ArrayList;
import java.util.Collections;

class Pair implements Comparable<Pair>{
    int x;
    int y;
    int dist;
    public Pair(int x, int y, int dist){
        this.x=x;
        this.y=y;
        this.dist=dist;
    }
    
    public int compareTo(Pair p){
        return p.dist;
    }
}

public class BClosestPoints{
    public static ArrayList<ArrayList<Integer>> solve(int[][] A, int B){
        ArrayList<Pair> list = new ArrayList<>();
        for(int i=0;i<A.length;i++){
            
            int x=A[i][0];
            int y=A[i][1];
            int dist = x*x + y*y;
            list.add(new Pair(x,y,dist));
            // Pair p = list.get(list.size()-1);
            // System.out.println(p.x+" "+p.y+" "+p.dist);
            
        }
        Collections.sort(list);
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<B;i++){
            ArrayList<Integer> inner = new ArrayList<>();
            Pair p = list.get(i);
            int x=p.x;
            int y=p.y;
            inner.add(x);
            inner.add(y);
            res.add(inner);
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] A = {{-762, 643},{693, -1004},{-1026, 680},{722, -1092}, {-875, 630}, {787, -860}, {-807, 999}, {1015, -788}, {-760, 889}, {990, -642}, {-1098, 1044}, {863, -614}, {-744, 651}, {959, -898}, {-905, 926}, {808, -725}, {-730, 809}, {871, -908}, {-993, 957}, {658, -924}, {-927, 872}, {735, -821}, {-1069, 1018}, {839, -777}, {-957, 786}, {853, -942}, {-865, 955}, {705, -1072}, {-717, 940}, {922, -618}, {-1013, 802}, {1065, -884}, {-638, 1063}, {654, -882}, {-722, 718}, {703, -870}, {-837, 1059}, {723, -747}, {-869, 620}, {951, -625}, {-890, 693}, {1043, -927}, {-745, 636}, {976, -951}, {-1055, 711}, {658, -867}, {-1011, 1049}, {867, -624}, {-685, 1018}, {1018, -962}, {-1070, 885}, {954, -798}, {-1005, 1095}, {-370, 81}, {156, -484}, {-286, 228}, {476, -87}, {-450, 114}, {86, -315}, {-89, 466}, {383, -447}};
        int B=8;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list = solve(A,B);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).get(0)+" "+list.get(i).get(1));
        }
    }
}