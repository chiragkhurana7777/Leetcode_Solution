class Solution {
    public int numIdenticalPairs(int[] nums) {
        // int count=0
        int[] arr=new int[101];
        for(int i : nums){
            arr[i]++;
        } 
        int count=0;
        for(int n: arr){
            count+=(n*(n-1)/2);
        }
        return count;




    }
}