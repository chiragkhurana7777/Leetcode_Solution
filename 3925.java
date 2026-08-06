class Solution {

    public int[] concatWithReverse(int[] nums) {

        int[] ans = new int[nums.length*2];

        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        int n=nums.length;
        int k=1;
        for(int i=n;i<nums.length+n;i++){
            ans[i]=nums[i-k];
            k+=2;
        }

        return ans;
    }
}