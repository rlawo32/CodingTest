import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[] temp = new int[numlist.length];
        for(int i=0; i<numlist.length; i++) {
            temp[i] = Math.abs(numlist[i]-n);
        }
        Arrays.sort(temp);
        Arrays.sort(numlist);
        int tmp = numlist.length-1;
        for(int i=0; i<numlist.length; i++) {
            
            for(int j=tmp; j>=0; j--) {
                if(temp[i] == Math.abs(numlist[j]-n)) {
                    answer[i] = numlist[j];
                    numlist[j] = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}