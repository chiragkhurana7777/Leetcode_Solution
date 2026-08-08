class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] freq = new int[51];
        for(int i: nums){
            freq[i]++;
        }

        int ans=0;
        for(int i=0;i<=50;i++){
            if(freq[i]>1){
                ans^=i;
                

            }
        }
        
        return ans;
    }
}