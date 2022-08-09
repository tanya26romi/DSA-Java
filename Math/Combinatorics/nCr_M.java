package Math.Combinatorics;

import java.util.Arrays;

public class nCr_M {
    public static int solve(int A, int B, int C) {
        int n=A;
        int r=B;
        int m=C;
        int[][] dp = new int[n+1][r+1];
        for(int[] row:dp){
            Arrays.fill(row, -1);
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<=r;j++){
                if(i==0 && j==0 || i==j){
                    dp[i][j]=1;
                }
                else if(i==0 || i<j){
                    dp[i][j]=0;
                }
                else if(j==0){
                    dp[i][j]=1;
                }

            }
        } 

        for(int i=1;i<=n;i++){
            for(int j=1;j<=r;j++){
                if(dp[i][j]==-1){
                    dp[i][j]=(dp[i-1][j]%m+dp[i-1][j-1]%m)%m;
                }
            }
        }

        // for(int i=0;i<=n;i++){
        //     for(int j=0;j<=r;j++){
        //         System.out.print(dp[i][j]+ " ");
        //     }
        //     System.out.println();
        // }

        return dp[n][r];
    }
    public static void main(String[] args) {
        int A=5;
        int B=2;
        int C=13;
        System.out.println(solve(A,B,C));
    }
}
