class Solution {

    public int product(int n){
        int product=1;
        
        while(n!=0){
            product*=n%10;
            n/=10;
        }
        return product;
    }

    public int smallestNumber(int n, int t) {
        
        while(true){
            int ans=product(n);
            if(ans%t==0){
                break;
                
            }
            n++;
        }
        return n;
    }
}