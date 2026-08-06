class Solution {
    public String winningPlayer(int x, int y) {
        
        boolean al=false;
        while(y>=4 && x>=1){
            if(x>=1 && y>=4){
                x--;
                y-=4;
                al=true;

            }
            if(x>=1 && y>=4){
                x--;
                y-=4;
            
            al=false;
            }

        }

        if(al) return "Alice";
        else return "Bob";


    }
}

class Solution1 {
    public String winningPlayer(int x, int y) {

        if(Math.min(x,y/4) % 2 == 0) return "Bob";
        return "Alice";

    }
}