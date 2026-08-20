class Solution {
    public String largestOddNumber(String num) {
        
        int n=num.length();
        
        int i;
        for(i=n-1;i>=0;i--){
            int a=num.charAt(i)-'0';
            if(a%2!=0){
                break;
            }
        }

        return num.substring(0,i+1);

    }
}