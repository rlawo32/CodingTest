class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String strK = String.valueOf(k);
        String temp = "";
        for(int n=i; n<=j; n++) {
            String strI = String.valueOf(n);
            if(strI.contains(strK)) {
                temp += strI;
            }
        }
        char[] arr = temp.toCharArray();
        for(char c : arr) {
            if(strK.equals(c+ "")) {
                answer++;
            }
        }
        return answer; 
    }
}