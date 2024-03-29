import java.lang.Math;

class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int tmp1 = (int) Math.abs(array[0]-n);;
        for(int i : array) {
            int tmp2 = (int) Math.abs(i-n);
            if(tmp1 > tmp2) {
                tmp1 = tmp2;
                answer = i;
            } else if(tmp1 == tmp2) {
                if(answer > i) {
                    answer = i;
                }
            }
        }
        return answer;
    }
}