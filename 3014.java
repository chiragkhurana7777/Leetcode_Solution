class Solution {
    public int minimumPushes(String word) {
        
        int l=word.length();
        int main=l/8;
        int left=l%8;

        return (8*main*(main+1)/2 + left*(main+1));



    }
}

class Solution1 {
    public int minimumPushes(String word) {
        
        int l=word.length();
        int ans=0;

        for(int i=0;i<l;i++){
            ans+=(i/8)+1;
        }
        return ans;



    }
}