class Solution {
    public String toLowerCase(String s) {
        
        StringBuilder ans = new StringBuilder(s);

        for(int i=0;i<ans.length();i++){
            char ch = ans.charAt(i);
            
            if(ch>='A' && ch<='Z'){
                ans.setCharAt(i,(char)(ch+32));
            }
        }

        return ans.toString();
    }
}