class Solution {
    public int solution(String before, String after) {
        char[] arr = before.toCharArray();
        for(char c : arr) {
            int tmp = after.indexOf(c+"");
            if(tmp != -1) {
                after = after.substring(0, tmp) + after.substring(tmp+1);
            }
        }
        return after.length() == 0 ? 1 : 0;
    }
}