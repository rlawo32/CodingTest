class Solution {
    boolean solution(String s) {
        int cnt1 = 0;
        int cnt2 = 0;
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        
        for(char c : arr) {
            if(c == 'y') {
                cnt1++;
            } else if(c == 'p') {
                cnt2++;
            }
        }

        return cnt1 == cnt2 ? true : false;
    }
}