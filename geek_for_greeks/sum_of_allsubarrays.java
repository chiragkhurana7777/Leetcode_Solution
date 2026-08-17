class Solution {
    public int subarraySum(int[] arr) {
        // code here
        int result=0;
        int n= arr.length;
        for(int i=0;i<n;i++){
            result+=(arr[i]*(i+1)*(n-i));
        }
        return result;
    }
}

