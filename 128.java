import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0 || n==1) return n;
        
        int longest=1;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        for(int num : set){
            if(!set.contains(num-1)){
                int current=1;
                int x=num;
                int i=1;
                while(set.contains(x+i)){
                    current++;
                    i++;
                }

                longest=Math.max(longest,current);
            }
        }

        return longest;

    }
}