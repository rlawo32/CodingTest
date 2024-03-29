class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++) {
            int tmp = 1;
            for(int j=1; j<=i; j++) {
                tmp *= j;
            }
            if(tmp <= n) {
                answer = i;
            } else {
                break;
            }
        }
        return answer;
    }
}