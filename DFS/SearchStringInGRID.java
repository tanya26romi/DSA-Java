package DFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

// class Pair{
//     int row;
//     int col;
//     public Pair(int row, int col){
//         this.row=row;
//         this.col=col;
//     }
// }
public class SearchStringInGRID {
    
    // public static int solve(int n, int m, char[][] grid, String str, int idx){
    //     Queue<Pair> que = new LinkedList<>();
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             if(grid[i][j]==str.charAt(idx)){
    //                 que.offer(new Pair(i,j));
    //             }
    //         }
    //     }
    //     //que - [0-2, 2-3, 4-2]
    //     idx++;
    //     List<List<Integer>> list = new ArrayList<>();
    //     Stack<Pair> stk = new Stack<>();
    //     while(!que.isEmpty()){
    //         List<Integer> inner = new ArrayList<>();
    //         Pair p = que.poll();
    //         int x=p.row;
    //         int y=p.col;
    //         stk.push(p);
    //         inner.add(x);
    //         inner.add(y);
    //         if(grid[x+1][y]==str.charAt(idx) || grid[x][y+1]==str.charAt(idx)){
    //             continue;
    //         }
    //         if(grid[x+1][y]==str.charAt(idx)){
    //             que.offer(new Pair(x+1,y));
    //         }
    //         if(grid[x][y+1]==str.charAt(idx)){
    //             que.offer(new Pair(x,y+1));
    //         }
    //         return 0;
          
    //     }
        // Stack<Pair> stk = new Stack<>();
        // Queue<Pair> temp_que = new LinkedList<>();
        // while(!que.isEmpty()){
        //     Pair p = que.poll();
        //     int x=p.row;
        //     int y=p.col;
        //     for(int i=x;i<n;i++){
        //         for(int j=y;j<m;j++){
        //             if(grid[i][j]==str.charAt(idx)){

        //             }
        //         }
        //     }
        // }


        
    
    public static void main(String[] args) {
        char[][] grid = { {'g','a','c','d','e','f'},{'m','m','i','c','d','s'},{'i','d','t','a','b','m'},{'d','f','g','y','h','i'},{'l','k','a','m','i','t'}};
        String str="amit";
        int n=grid.length;
        int m=grid[0].length;
        int idx=0;
        //solve(n,m,grid,str, idx);
    }
}
