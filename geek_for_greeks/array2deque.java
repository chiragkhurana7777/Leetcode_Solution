import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        // code here
        Deque<Integer> dq = new LinkedList<>();
        for(int x:arr){
            dq.add(x);
        }
        return dq;
    }
}