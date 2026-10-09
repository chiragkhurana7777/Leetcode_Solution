class Solution {
    public int mySqrt(int x) {
        int l=0,r=x;
        while(l<=r){
            int mid=l+(r-l)/2;
            long temp=(long)mid*mid;
            if(temp==x) return mid;

            if(temp>x) r=mid-1;
            else l=mid+1;

        }
        return r;
    }
}