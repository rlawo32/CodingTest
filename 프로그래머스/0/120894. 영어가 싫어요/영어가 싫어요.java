class Solution {
    public long solution(String numbers) {
        String answer = "";
        String temp = "";
        char[] arr = numbers.toCharArray();
        
        for(char c : arr) {
            temp += c + "";
            if(temp.equals("zero")) {
                temp = "";
                answer += "0";
            } else if(temp.equals("one")) {
                temp = "";
                answer += "1";
            } else if(temp.equals("two")) {
                temp = "";
                answer += "2";
            } else if(temp.equals("three")) {
                temp = "";
                answer += "3";
            } else if(temp.equals("four")) {
                temp = "";
                answer += "4";
            } else if(temp.equals("five")) {
                temp = "";
                answer += "5";
            } else if(temp.equals("six")) {
                temp = "";
                answer += "6";
            } else if(temp.equals("seven")) {
                temp = "";
                answer += "7";
            } else if(temp.equals("eight")) {
                temp = "";
                answer += "8";
            } else if(temp.equals("nine")) {
                temp = "";
                answer += "9";
            }
        }
        
        return Long.valueOf(answer);
    }
}