class Solution {
    public boolean judgeCircle(String moves) {
        
        int[] freq= new int[26];

        for(int i=0;i<moves.length();i++){
            freq[moves.charAt(i)-65]++;
        }

        if(freq['U'-65]==freq['D'-65] && freq['R'-65]==freq['L'-65]) return true;
        else return false;   
    }
}

/*Both are asymptotically optimal, but the x, y coordinate approach is slightly better in practice.

Approach	Time	Space	Preference
Your freq[26]	O(n)	O(1)	✅ Good
x, y coordinates	O(n)	O(1)	🏆 Cleaner */

class Solution1 {
    public boolean judgeCircle(String moves) {
        
        // int[] freq= new int[26];
        int y=0;
        int x=0;
        for(int i=0;i<moves.length();i++){
            // freq[moves.charAt(i)-65]++;
            if(moves.charAt(i)=='U') y++;
            else if(moves.charAt(i)=='D') y--;
            else if(moves.charAt(i)=='R') x++;
            else if(moves.charAt(i)=='L') x--;

        }

        if(x==0 && y==0) return true;
        else return false;   
    }
}