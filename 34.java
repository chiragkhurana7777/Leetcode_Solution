class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums,target,true),first(nums,target,false)};
    }
    int first(int[] a , int t , boolean first){
        int l=0,h=a.length-1,ans=-1;

        while(l<=h){
            int mid=l+(h-l)/2;
            if(a[mid]==t){
                ans=mid;
                if (first) h=mid-1;
                else l=mid+1;
            }
            else if (a[mid]<t){
                l=mid+1;
            }
            else h=mid-1;
        }

        return ans;
    }
}