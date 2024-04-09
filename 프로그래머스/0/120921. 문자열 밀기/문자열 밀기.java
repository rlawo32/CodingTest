class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String temp = A;
        for(int i=0; i<A.length(); i++) {
            temp = temp.substring(temp.length()-1) + temp.substring(0, temp.length()-1);  
            answer += 1;
            if(temp.equals(B)) {
                break;
            }
        }
        return A.equals(B) ? 0 : answer == A.length() ? -1 : answer;
    }
}