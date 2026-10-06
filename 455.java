import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m=g.length;
        int n=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0,r=0;

        while(l<m && r<n){
            if(s[r]>=g[l]){
                l++;
                r++;
            }
            else r++;
        }
        return l;
    }
}