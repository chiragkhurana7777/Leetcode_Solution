class Solution {

    public static boolean palindrome(String st){

        int left=0;
        int right=st.length()-1;
        while(left<right){
            if(st.charAt(left)!=st.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    public String longestPalindrome(String s) {

        
        String ans="";
        for(int i=0;i<s.length();i++){
            
            for(int j=i;j<s.length();j++){

                String t=s.substring(i,j+1);
                if(palindrome(t)){
                    
                    if(t.length()>ans.length()){
                        ans=t;

                    }
                 
                }
            }   
        }
        return ans;
        
    }
}