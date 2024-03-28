import java.lang.Math;

class Solution {
    public int[] solution(long n) {
        int[] answer = new int[(int)Math.log10(n) + 1];
        char[] arr = String.valueOf(n).toCharArray();
        int idx = 0;
        for(int i=arr.length-1; i>=0; i--) {
            answer[idx++] = arr[i]-48;
        }
        return answer;
    }
}