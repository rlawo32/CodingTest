class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        int idx = 0;
        for(int i=0; i<picture.length; i++) {
            for(int j=0; j<k; j++) {
                String temp = "";
                for(int n=0; n<picture[i].length(); n++) {
                    for(int m=0; m<k; m++) {
                        temp += picture[i].substring(n, n+1);
                    }
                }
                answer[idx++] = temp;
            }
        }
        return answer;
    }
}