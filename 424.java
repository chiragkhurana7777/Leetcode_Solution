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