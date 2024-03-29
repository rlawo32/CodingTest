import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] copy = new int[emergency.length];
        int idx = 0;
        for(int i=0; i<copy.length; i++) {
            copy[i] = emergency[i];
        }
        Arrays.sort(copy);
        for(int i=0; i<copy.length; i++) {
            for(int j=0; j<copy.length; j++) {
                if(emergency[i] == copy[j]) {
                    answer[idx++] = copy.length-j;
                }
            }
        }
        
        return answer;
    }
}