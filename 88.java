class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // for(int i=m;i<m+n;i++){
        //     nums1[i]=nums2[i-m];
        // }        

        int left=0;
        int right=0;
        int[] temp= new int[m+n]; 

        int i=0;
        while(left<m && right<n){
            if(nums1[left]<=nums2[right]){
                temp[i]=nums1[left];
                left++;
                i++;
            }
            else{
                temp[i]=nums2[right];
                right++;
                i++;
            }
        }

            while(left<m){
                temp[i]=nums1[left];
                left++;
                i++;
            }

            while(right<n){
                temp[i]=nums2[right];
                right++;
                i++;
            }

        
        for(int k=0;k<temp.length;k++){
            nums1[k]=temp[k];
        }    



    }
}

//without extra space:

class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int left=m-1;
        int right=n-1;
        int i=m+n-1;

        while(left>=0 && right>=0){

            if(nums1[left]>=nums2[right]){
                nums1[i]=nums1[left];
                left--;
                i--;
            }
            else{
                nums1[i]=nums2[right];
                right--;
                i--;
            }


        }

        
        while(right>=0){
            nums1[i]=nums2[right];
                right--;
                i--;
        }


    }
}