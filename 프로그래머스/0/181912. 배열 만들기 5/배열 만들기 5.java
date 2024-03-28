import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(String str : intStrs) {
            String temp = str.substring(s, s+l);
            int tmp = Integer.parseInt(temp);
            if(tmp > k) {
                answer.add(tmp);
            }
        }
        return answer;
    }
}