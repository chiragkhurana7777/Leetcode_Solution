class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        
        StringBuilder st= new StringBuilder();
        int cycle = numRows*2-2;

        for(int i=0;i<numRows;i++){
            StringBuilder ans = new StringBuilder();
            int p=i;
            while(p<s.length()){
                ans.append(s.charAt(p));

                int second=p+cycle-2*i;

                if(i!=0 && i!=numRows-1 && second<s.length()){
                    ans.append(s.charAt(second));
                }               

                p+=cycle;
            }
            st.append(ans);
        }
        return st.toString();
    }
}