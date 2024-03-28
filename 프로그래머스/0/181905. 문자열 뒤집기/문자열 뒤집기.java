class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String temp1 = my_string.substring(0, s);
        String temp2 = my_string.substring(s, e+1);
        String temp3 = my_string.substring(e+1);
        for(int i=temp2.length()-1; i>=0; i--) {
            answer += temp2.substring(i, i+1);
        }
        return temp1 + answer + temp3;
    }
}