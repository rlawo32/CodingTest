import java.util.*;

class Solution {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> answer = new Stack<>();
        for(int i : arr) {
            if(answer.isEmpty()) {
                answer.push(i);
            } else if(answer.peek() == i) {
                answer.pop();
            } else {
                answer.push(i);
            }
        }
        
        if(answer.isEmpty()) {
            answer.push(-1);
        }
        
        return answer;
    }
}