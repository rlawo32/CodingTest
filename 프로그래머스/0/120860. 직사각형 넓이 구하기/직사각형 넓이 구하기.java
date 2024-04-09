import java.lang.Math;

class Solution {
    public int solution(int[][] dots) {
        int tmp1 = dots[0][0];
        int tmp2 = dots[0][1];
        int tmp3 = 0;
        int tmp4 = 0;
        for(int i=1; i<dots.length; i++) {
            if(tmp1 != dots[i][0]) {
                tmp3 = Math.abs(tmp1-dots[i][0]);
            } else if(tmp2 != dots[i][1]) {
                tmp4 = Math.abs(tmp2-dots[i][1]);
            }
        }
        return tmp3 * tmp4;
    }
}