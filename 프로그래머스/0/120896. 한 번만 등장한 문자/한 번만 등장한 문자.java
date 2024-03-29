import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {
            String str = s.substring(i, i+1);
            if(s.indexOf(str, i+1) != -1) {
                s = s.replace(str, "");
                i--;
            }
        }
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        for(char c : arr) {
            answer += c + "";
        }
        return answer;
    }
}