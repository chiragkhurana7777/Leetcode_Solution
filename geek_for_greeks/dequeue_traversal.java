import java.util.ArrayDeque;

class Solution {
    public static void printDeque(ArrayDeque<Integer> deq) {
        while (!deq.isEmpty()) {
            System.out.print(deq.poll() + " ");
        }
        System.out.println();
    }
}