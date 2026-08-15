class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            currentsum=Math.max(nums[i],currentsum+nums[i]);
            max=Math.max(max,currentsum);
        }
        return max;
    }
}
//Kadane's algorithm:

/*PROBLEM:
Find the contiguous subarray with the maximum sum.

Example:
[-2, 1, -3, 4, -1, 2, 1, -5, 4]

Maximum subarray:
[4, -1, 2, 1]

Maximum sum = 6


KEY IDEA:
At every element, decide:

1. Start a new subarray from nums[i]
OR
2. Continue the previous subarray

So:

currentSum = max(nums[i], currentSum + nums[i])

Then keep track of the best sum found:

maxSum = max(maxSum, currentSum)


JAVA CODE:

class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}


WHAT currentSum MEANS:
currentSum = maximum sum of a subarray that MUST end at the current index.


WHAT maxSum MEANS:
maxSum = maximum subarray sum found anywhere so far.


WHY Math.max()?

currentSum = Math.max(nums[i], currentSum + nums[i]);

Example:
currentSum = -10
nums[i] = 5

Option 1:
[5] = 5

Option 2:
[-10, 5] = -5

Choose 5.

A negative previous sum is discarded because carrying it forward only makes the sum worse.


DRY RUN:

nums = [-2, 1, -3, 4, -1, 2, 1]

Start:
currentSum = -2
maxSum = -2

i = 1, nums[i] = 1
currentSum = max(1, -2 + 1) = 1
maxSum = max(-2, 1) = 1

i = 2, nums[i] = -3
currentSum = max(-3, 1 - 3) = -2
maxSum = max(1, -2) = 1

i = 3, nums[i] = 4
currentSum = max(4, -2 + 4) = 4
maxSum = max(1, 4) = 4

i = 4, nums[i] = -1
currentSum = max(-1, 4 - 1) = 3
maxSum = max(4, 3) = 4

i = 5, nums[i] = 2
currentSum = max(2, 3 + 2) = 5
maxSum = max(4, 5) = 5

i = 6, nums[i] = 1
currentSum = max(1, 5 + 1) = 6
maxSum = max(5, 6) = 6

ANSWER = 6


IMPORTANT EDGE CASE:

Do NOT initialize maxSum to 0.

Wrong:
int currentSum = 0;
int maxSum = 0;

For:
[-5, -2, -8]

This would return 0.

Correct answer = -2.

Therefore initialize using nums[0]:

int currentSum = nums[0];
int maxSum = nums[0];


COMPLEXITY:

Time:  O(n)
Space: O(1)

WHY O(n)?

Each element is processed only once.

WHY O(1) SPACE?

Only two variables are required.


PATTERN TO REMEMBER:

currentSum = best subarray ending HERE

maxSum = best subarray seen ANYWHERE

At every element:

START NEW
      OR
CONTINUE OLD

Then update the global maximum.


ONE-LINE MEMORY TRICK:

"Should I start fresh, or continue what I already have?"

currentSum = Math.max(nums[i], currentSum + nums[i]); */