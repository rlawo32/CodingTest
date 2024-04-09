import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        ArrayList<Integer> temp = new ArrayList<>();
        int answer = 0;
        for(int i=0; i<rank.length; i++) {
            if(attendance[i]) {
                temp.add(rank[i]);
            }
        }
        Collections.sort(temp);
        for(int i=0; i<3; i++) {
            int tmp = 0;
            for(int j=0; j<rank.length; j++) {
                if(temp.get(i) == rank[j]) {
                    tmp = j;
                    break;
                }
            }
            answer += i == 0 ? 10000*tmp : 
            i == 1 ? 100*tmp : tmp;
        }
        return answer;
    }
}