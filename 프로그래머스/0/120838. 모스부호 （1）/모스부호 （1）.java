class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] arr = letter.split(" ");
        for(String str : arr) {
            for(int i=0; i<morse.length; i++) {
                if(str.equals(morse[i])) {
                    char c = (char) (i + 97);
                    answer += c + "";
                    break;
                }
            }
        }
        
        return answer;
    }
}