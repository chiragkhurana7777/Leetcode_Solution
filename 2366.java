class Solution {
    public long minimumReplacement(int[] nums) {
        int n=nums.length;
        int maxallowed=nums[n-1];
        long operations =0;

        for(int i=n-2;i>=0;i--){
            if(nums[i]<=maxallowed){
                maxallowed=nums[i];
            }
            else {
                int parts = (int)Math.ceil((double)nums[i]/maxallowed);
                operations += parts-1;
                maxallowed=nums[i]/parts;
            }
        }
        return operations;
    }
}