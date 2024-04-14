import java.lang.*;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = (int) Math.ceil((double)total/num);
        int min = (int) Math.floor((double)num/2);
        for(int i=0; i<num; i++) {
                answer[i] = (mid-min)+i;
        }
        return answer;
    }
}