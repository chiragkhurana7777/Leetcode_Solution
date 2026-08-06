class Solution {
    public int getLucky(String s, int k) {
        StringBuilder st = new StringBuilder();

        for(int i=0;i<s.length();i++){
            st.append(s.charAt(i)-'a'+1);
        }

        int sum=0;
        while(k>0){
            sum=0;    
            for(int i=0;i<st.length();i++){
                sum+= st.charAt(i)-'0';
            }

            st = new StringBuilder(Integer.toString(sum));
            
            k--;
        }

        return sum;
        
    }
}
class Solution1 {
    public int getLucky(String s, int k) {
        

        int sum=0;

        for(int i=0;i<s.length();i++){
            int val=s.charAt(i)-'a'+1;

            while(val>0){
                sum+=val%10;
                val/=10;
            }       
        }

        while(--k>0){
            int newsum=0;

            while(sum>0){
                newsum+=sum%10;
                sum/=10;
            }

            sum=newsum;
        }

        return sum;       
    }
}