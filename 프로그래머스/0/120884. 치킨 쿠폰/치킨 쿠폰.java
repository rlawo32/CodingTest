class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int born = 0;
        while(chicken >= 10 || born >= 10) {
            born += chicken%10;
            answer += chicken/10;
            chicken = chicken/10;
            
            if(chicken < 10) {
                born += chicken;
            }
            
            if(born >= 10) {
                int tmp = 0;
                answer += born/10;
                tmp = born/10;
                born = born%10;
                born += tmp;
            }
        }
        return answer;
    }
}