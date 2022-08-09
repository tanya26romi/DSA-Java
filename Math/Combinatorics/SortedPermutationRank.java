package Math.Combinatorics;

import java.util.Arrays;
import java.util.HashMap;

public class SortedPermutationRank {
    public static long fact(long n, int mod){
        if(n==0 || n==1){
            return 1;
        }
        return ((long)fact(n-1, mod)%mod*(long)n%mod)%mod;
    }
    public static int findRank(String A) {
        // abcd
        int mod = 1000003;
        int n = A.length();
        boolean[] visited = new boolean[n];

        char[] ch = A.toCharArray();
        Arrays.sort(ch);
        String sorted = String.valueOf(ch);

        HashMap<Character, Integer> hmap = new HashMap<>();

        for(int i=1;i<=n;i++){
            hmap.put(ch[i-1], i);
        }//(long)
        System.out.println(hmap);
        long rem=n;
        long count=0;
        long res=0;
        for(int i=0;i<n;i++){
            count=0;
            char temp = A.charAt(i);
            int idx = hmap.get(temp);
            visited[idx-1]=true;
            //count no of non-visited and smaller
            for(int j=1;j<idx;j++){
                if(visited[j-1]==false){
                    count++;
                }
            }
            System.out.println("char= "+temp+" idx= "+idx+" no. of elements smaller and not visited="+count);
            res += ((count)%mod*(fact(rem-1, mod))%mod)%mod;
            rem--;

        }
        int ans = (int)(res+1)%mod;
        return ans;
    }
    public static void main(String[] args) {
        String str="ZCSFLVHXRYJQKWABGT";
        System.out.println(findRank(str));
    }
}
