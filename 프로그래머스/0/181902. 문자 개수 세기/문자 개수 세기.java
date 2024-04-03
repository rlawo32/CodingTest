class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] arr = my_string.toCharArray();
        
        for(char c : arr) {
            int i = (int) c;
            if(i >= 65 && i <= 90) {
                answer[i-65] += 1;
            } else if(i >= 97 && i <= 122) {
                answer[i-71] += 1;
            }
        }
        
        return answer;
    }
}