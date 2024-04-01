import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        int[] len = new int[2];
        len[0] = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 2) {
                if(len[0] == -1) {
                    len[0] = i;
                }
                len[1] = i;
            }
        }
        ArrayList<Integer> answer = new ArrayList<>();
        
        if(len[0] == -1) {
            answer.add(-1);
        } else {
            for(int i=len[0]; i<=len[1]; i++) {
                answer.add(arr[i]);
            }
        }
        
        return answer;
    }
}