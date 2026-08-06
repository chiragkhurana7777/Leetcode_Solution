// Boyer–Moore Voting Algorithm

class Solution {
    public int majorityElement(int[] nums) {
        int majority=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==majority){
                count++;
            }
            else count--;

            if(count==-1){
                majority=nums[i];
                count=1;
            }
        }
        return majority;
    }
}

/*Let’s understand the Boyer–Moore Voting Algorithm with an example.

Suppose:

nums = [2, 2, 1, 1, 1, 2, 2]

We maintain two variables:

candidate → the number we currently think could be the majority.
count → how strong that candidate currently is.

The main idea is cancellation: whenever we find a different number, we cancel one occurrence of our candidate against that different number.

Current number	Candidate	Count	What happens
2	2	1	count was 0 → choose 2
2	2	2	same → count++
1	2	1	different → count--
1	2	0	different → count--
1	1	1	count was 0 → choose 1
2	1	0	different → count--
2	2	1	count was 0 → choose 2

Final candidate = 2, so the answer is 2.

Why does this work?

Think of different elements fighting and cancelling each other.

For example:

[2, 2, 1, 1, 1, 2, 2]

There are:

Four 2s
Three 1s

Cancel one 2 with one 1:

2 ↔ 1 ❌

Do this three times. After all possible cancellations, one 2 is still left.

Because the majority element appears more than n/2 times, there aren't enough other elements to cancel all of its occurrences. Therefore, the element that survives must be the majority element.

The algorithm basically performs this cancellation using just candidate and count, which is why it needs only O(1) extra space and takes O(n) time.

Today 8:04 PM
so it works only because its given that the majority is more than n/2

Yes, exactly. The Boyer–Moore approach can directly return the answer because LeetCode 169 guarantees that a majority element exists and appears more than n/2 times. */