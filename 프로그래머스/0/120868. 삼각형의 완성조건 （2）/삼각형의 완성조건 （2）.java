import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int a = 0;
        int b = 0;
        Arrays.sort(sides);
        
        Stack<Integer> answer = new Stack<>();
        a = sides[1] - sides[0]; 
        b = sides[1] + sides[0];
        for(int i=a+1; i<=sides[1]; i++) {
            if(answer.isEmpty()) {
                answer.push(i);
            } else if(answer.peek() != i) {
                answer.push(i);
            }
        }
        for(int i=sides[1]+1; i<b; i++) {
            if(answer.isEmpty()) {
                answer.push(i);
            } else if(answer.peek() != i) {
                answer.push(i);
            }
        }
        
        return answer.size();
    }
}