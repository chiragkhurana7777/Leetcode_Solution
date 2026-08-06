// Binary Exponentiation (Exponentiation by Squaring)

class Solution {
    public double myPow(double x, int n) {

        // Cast to long to handle the edge case where n = Integer.MIN_VALUE
        // -(-2147483648) overflows in int, but fits in long
        
        long exp=n;
        if(exp<0){
            x=1/x;
            exp=-exp;
        }

        double result=1;
        double base=x;

        while(exp>0){

            if(exp%2!=0){
                result*=base;
            }
                base*=base;
                exp/=2;

        }
        return result;
        
    }
}