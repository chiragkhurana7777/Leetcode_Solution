import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            int num=nums[i];
            nums[i]=num*num;
        }

        Arrays.sort(nums);
        return nums;
    }
}

class Solution1 {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }

            pos--;
        }

        return result;
    }
}