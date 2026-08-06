class Solution {

    public boolean judgeSquareSum(int c) {
        
        int a=0;
        int b=(int)Math.sqrt(c);

        while(a<=b){

            
            long check=(long)a*a +(long) b*b;
            if(check==c){
                return true;
            }
            else if(check<c){
                a++;
            }
            else{
                b--;
            }
            


        }
        return false;


    }
}