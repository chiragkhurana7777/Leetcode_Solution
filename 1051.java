import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        
        int[] copy = new int[heights.length];

        for(int i=0;i<heights.length;i++){
            copy[i]=heights[i];
        }

        Arrays.sort(copy);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=copy[i]) count++;
        }
        return count;
    }
}

class Solution1 {
    public int heightChecker(int[] heights) {

        int[] freq = new int[101];

       
        for (int height : heights) {
            freq[height]++;
        }

        int count = 0;
        int index = 0;

       
        for (int height = 1; height <= 100; height++) {

            while (freq[height] > 0) {

                if (heights[index] != height) {
                    count++;
                }

                index++;
                freq[height]--;
            }
        }

        return count;
    }
}