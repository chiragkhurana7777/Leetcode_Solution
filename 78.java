import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n=nums.length;

        for(int mask=0 ; mask<(1<<n) ; mask++){
            List<Integer> temp = new ArrayList<>();

            for(int j=0;j<n;j++){
                if((mask & (1<<j)) !=0){
                    temp.add(nums[j]);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}