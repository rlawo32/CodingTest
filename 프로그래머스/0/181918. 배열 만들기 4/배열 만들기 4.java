import java.util.*;

class Solution {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            if(stk.isEmpty()) {
                stk.push(arr[i]);
            } else if(stk.peek() < arr[i]) {
                stk.push(arr[i]);
            } else if(stk.peek() >= arr[i]) {
                stk.pop();
                i--;
            }
        }
        return stk;
    }
}