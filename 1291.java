import java.util.*;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        List<Integer> num = new ArrayList<>();
        
        for(int i=low;i<=high;i++){
            
            int previous=-1;
            int x=i;
            boolean flag=true;
            while(x!=0){
                
                int next = x%10;
                
                if (previous==-1){
                previous=next;
                x/=10;
                continue;
                }

                if(previous!=next+1){
                    flag=false;
                    break;
                }
                previous=next;
                x/=10;
                
            }
            if(flag) num.add(i);


        }

        return num;
    }
}