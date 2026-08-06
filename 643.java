class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int right=k-1;

        double sum=0;
        for(int i=left;i<=right;i++){
            sum+=nums[i];
        }

        double max=sum/k;
        
        while(right<nums.length-1){
            
            sum-=nums[left];
            left++;
            right++;
            sum+=nums[right];
            double max_avg=sum/k;
            if(max_avg>max) max=max_avg;
        }
        return max;


    }
}
//best:
class Solution1 {
    public double findMaxAverage(int[] nums, int k) {
        
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }

        int max=sum;

        for(int i=k;i<nums.length;i++){
            sum+= nums[i]-nums[i-k];
            if(sum>max) max=sum;
        }
        return (double)max/k;

    }
}