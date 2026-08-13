import java.util.HashMap;

class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character , Integer> map = new HashMap<>();
        int left=0;
        int right=0;
        int max_length=0;
        int max=0;
        
        while(right<s.length()){
            int num=map.getOrDefault(s.charAt(right),0)+1;
            map.put(s.charAt(right),num);
            
            max=Math.max(num,max);
            
            if(right-left+1-max>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            

            max_length=Math.max(max_length,right-left+1);
            right++;
        }
        return max_length;
    }
}
/*
### Why `if` and `while` both work in LeetCode 424

For 424, both of these can work:

```java
if (windowSize - maxFrequency > k) {
    left++;
}
```

and

```java
while (windowSize - maxFrequency > k) {
    left++;
}
```

**Reason:**

`right` increases by only **1** in each iteration, so the window can become invalid by at most **one position**.

Therefore, in the standard 424 solution, one `left++` is enough, so `if` works.

The `while` version is also correct because it keeps checking the condition after every `left++` and shrinks until the condition becomes false.

However, the standard `if` solution is simpler and sufficient for 424.

### Important point

`maxFrequency` is **not decreased** when `left` moves. It represents the highest frequency encountered while expanding the window, not necessarily the exact highest frequency of the current window.

This is safe because we only need the **maximum length**, not the exact validity of every intermediate window.

### Complexity

Both versions are:

* **Time:** `O(n)`
* **Space:** `O(1)` for uppercase English letters

The `while` loop does not make it `O(n²)` because `left` can move forward at most `n` times overall.
*/