class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length()!=goal.length()) return false;
        String st= s+s;
        if(st.indexOf(goal)!=-1){
            return true;
        }
        return false;
    }
}