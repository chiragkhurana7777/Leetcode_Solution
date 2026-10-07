import java.util.Deque;

class Solution {
    public static void rotateDeque(Deque<Integer> dq, int type, int k) {
        // code here
        if(type==2) k=dq.size()-k;
        
        while(k-->0){
            dq.offerFirst(dq.pollLast());
        }
    }
}