class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for(String[] s : db) {
            if(id_pw[0].equals(s[0])) {
                if(id_pw[1].equals(s[1])) {
                    answer = "login";
                } else {
                    answer = "wrong pw";
                }
            }
        }
        return answer;
    }
}