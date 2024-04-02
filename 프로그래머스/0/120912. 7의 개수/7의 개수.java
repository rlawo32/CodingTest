class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String temp = "";
        for(int i : array) {
            temp += String.valueOf(i);
        }
        char[] arr = temp.toCharArray();
        for(char c : arr) {
            if(c == '7') {
                answer++;
            }
        }
        return answer;
    }
}