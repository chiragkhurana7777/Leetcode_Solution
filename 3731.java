import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int max = nums[0];
        int min = nums[0];

        for(int i : nums){
            max = Math.max(i, max);
            min = Math.min(i, min);
        }

        int[] arr = new int[max + 1];
        for(int i : nums){
            arr[i]++;
        }

        for(int i=min;i<max;i++){
            if(arr[i] == 0)
                ans.add(i);
        }
        return ans;


    }
}

class Solution1 {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            set.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}