import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int k) {
        Set<Integer> temp = new HashSet<>();
        ArrayList<Integer> answer = new ArrayList<>(temp);
        for(int i : arr) {
            int pre = temp.size();
            temp.add(i);
            
            if(temp.size() != pre) {
                answer.add(i);
            }
            
            if(answer.size() == k) {
                break;
            }
        }
        
        
        if(answer.size() < k) {
            int tmp = k-answer.size();
            for(int i=0; i<tmp; i++) {
                answer.add(-1);
            }
        }
        
        return answer;
    }
}