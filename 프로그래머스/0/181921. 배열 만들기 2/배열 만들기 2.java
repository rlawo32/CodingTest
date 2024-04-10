import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=l; i<=r; i+=1) {
            String temp = String.valueOf(i);
            int n = 0;
            for(int j=0; j<temp.length(); j++) {
                String s = temp.substring(j, j+1);
                if(!s.equals("5") && !s.equals("0")) {
                    n++;
                    break;
                }
            }
            if(n == 0) {
                answer.add(i);
            }
        }
        if(answer.size() == 0) {
            answer.add(-1);
        }
        return answer;
    }
}