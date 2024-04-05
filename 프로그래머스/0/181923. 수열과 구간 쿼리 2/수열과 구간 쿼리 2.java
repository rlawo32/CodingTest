import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int idx = 0;
        
        for(int i=0; i<queries.length; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=queries[i][0]; j<=queries[i][1]; j++) {
                temp.add(arr[j]);
            }
            Collections.sort(temp);
            for(int j=0; j<temp.size(); j++) {
                if(queries[i][2] < temp.get(j)) {
                    answer[idx] = temp.get(j);
                    break;
                }
            }
            
            if(answer[idx] == 0) {
                answer[idx] = -1;
            }
            idx++;
        }   
        
        return answer;
    }
}