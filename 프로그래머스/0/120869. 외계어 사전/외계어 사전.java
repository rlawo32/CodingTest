class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(String s : dic) {
            int cnt = 0;
            for(int i=0; i<spell.length; i++) {
                if(s.contains(spell[i])) {
                    cnt++;
                }
            }
            if(cnt == spell.length) {
                answer = 1;
            }
        }
        return answer;
    }
}