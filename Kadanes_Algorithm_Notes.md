# Kadane's Algorithm --- Maximum Subarray

## Problem

Find the **contiguous subarray** with the maximum sum.

Example:

``` text
[-2, 1, -3, 4, -1, 2, 1, -5, 4]

Maximum subarray:
[4, -1, 2, 1]

Maximum sum = 6
```

## Key Idea

At every element, decide:

1.  Start a new subarray from `nums[i]`
2.  Continue the previous subarray

So:

``` text
currentSum = max(nums[i], currentSum + nums[i])
```

Then keep track of the best sum found:

``` text
maxSum = max(maxSum, currentSum)
```

## What `currentSum` Means

`currentSum` = **maximum sum of a subarray that MUST end at the current
index.**

## What `maxSum` Means

`maxSum` = **maximum subarray sum found anywhere so far.**

## Java Code

``` java
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
```

## Why `Math.max()`?

The important line is:

``` java
currentSum = Math.max(nums[i], currentSum + nums[i]);
```

There are always two choices:

``` text
Option 1: Start fresh
nums[i]

Option 2: Continue previous subarray
currentSum + nums[i]
```

Choose whichever is larger.

### Example

Suppose:

``` text
currentSum = -10
nums[i] = 5
```

Option 1:

``` text
[5] = 5
```

Option 2:

``` text
[-10, 5] = -5
```

Choose `5`.

A negative previous sum is discarded because carrying it forward only
makes the future sum smaller.

## Dry Run

Array:

``` text
[-2, 1, -3, 4, -1, 2, 1]
```

Start:

``` text
currentSum = -2
maxSum = -2
```

  i     nums\[i\]   currentSum   maxSum
  --- ----------- ------------ --------
  0            -2           -2       -2
  1             1            1        1
  2            -3           -2        1
  3             4            4        4
  4            -1            3        4
  5             2            5        5
  6             1            6        6

Answer:

``` text
6
```

Maximum subarray:

``` text
[4, -1, 2, 1]
```

## Important Edge Case

Do **not** initialize `maxSum` to `0`.

Wrong:

``` java
int currentSum = 0;
int maxSum = 0;
```

For:

``` text
[-5, -2, -8]
```

this would return:

``` text
0
```

But the correct answer is:

``` text
-2
```

Therefore initialize using the first element:

``` java
int currentSum = nums[0];
int maxSum = nums[0];
```

## Complexity

``` text
Time:  O(n)
Space: O(1)
```

### Why `O(n)` Time?

Every element is processed exactly once.

### Why `O(1)` Space?

Only two variables are needed:

``` text
currentSum
maxSum
```

## Pattern to Remember

``` text
currentSum = best subarray ending HERE

maxSum = best subarray seen ANYWHERE
```

At every element:

``` text
START NEW
    OR
CONTINUE OLD
```

Then update the global maximum.

## One-Line Memory Trick

> **"Should I start fresh, or continue what I already have?"**

``` java
currentSum = Math.max(nums[i], currentSum + nums[i]);
```
