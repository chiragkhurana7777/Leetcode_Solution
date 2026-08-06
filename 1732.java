class Solution1 {
    public int largestAltitude(int[] gain) {

    int sum=0;
    int[] arr=new int[gain.length+1];
    arr[0]=0;
    for(int i=1;i<arr.length;i++){
        sum+=gain[i-1];
        arr[i]=sum;

    }
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
        if(max<arr[i]) max=arr[i];
    }

    return max;

    }
}

class Solution {
    public int largestAltitude(int[] gain) {

    int sum=0;
    int max=0;
    for(int i=0;i<gain.length;i++){
        sum+=gain[i];
        if(max<sum) max=sum;
    }
    
    return max;
    
    }
}