class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        for(int i=2; i<=a; i++) {
            if(a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
                i = 1;
            }
        } 
        for(int i=2; i<=1000; i++) {
            if(b % i == 0) {
                if(i != 2 && i != 5) {
                    answer = 2;
                    break;
                } else {
                    b /= i;
                    if(b == 1) {
                        break;
                    } else {
                        i = 1;    
                    }
                }
            }
        }
        
        return answer;
    }
}