import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<String> stack = new Stack<>();
        String[] arr = s.split(" ");
        int answer = 0;
        for(String str : arr) {
            if(str.equals("Z")) {
                stack.pop();
            } else {
                stack.push(str);
            }
        }
        for(String str : stack) {
            answer += Integer.parseInt(str);
        }
        
        return answer;
    }
}