import java.util.HashMap;

class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map= new HashMap<>();

        int left=0;
        int right=0;
        int max_length=0;
        
        while(right<s.length()){
            char ch=s.charAt(right);
            int freq=map.getOrDefault(ch,0)+1;
            map.put(ch,freq);

            while(map.get(ch)>2){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            max_length=Math.max(max_length,right-left+1);
            right++;
        }
        return max_length;
    }
}
//more space efficient and time also:

class Solution1 {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];

        int left=0;
        int right=0;
        int max_length=0;
        char ch;

        while(right<s.length()){
            ch=s.charAt(right);
            freq[ch-'a']++;
            

            while(freq[ch-'a']>2){
                freq[s.charAt(left)-'a']--;
                left++;
            }
            max_length=Math.max(max_length,right-left+1);
            right++;
        }
        return max_length;
    }
}