class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right=0;
        int zfreq=0;
        int max_length=0;
        while(right<nums.length){
            if(nums[right]==0) zfreq++;

            if(zfreq>k){
                if(nums[left]==0) zfreq--;
            
                left++;
            }

            max_length=Math.max(max_length,right-left+1);
            right++;
        }
        return max_length;
    }
}