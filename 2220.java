class Solution {
    public int minBitFlips(int start, int goal) {
        return Integer.bitCount(start^goal);
    }
}
class Solution1 {
    public int minBitFlips(int start, int goal) {
        int n=start^goal;
        int ans=0;
        while(n!=0){
            if(n%2==1) ans++;
            n/=2;
        }
        return ans;
    }
}