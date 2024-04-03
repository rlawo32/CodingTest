class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int tmp = 0;
        
        while(k > 0) {
            answer = numbers[tmp];
            tmp += 2;
            if(tmp >= numbers.length) {
                if(numbers.length % 2 == 0) {
                    tmp = 0;    
                } else {
                    if(tmp % 2 == 0) {       
                        tmp = 1;    
                    } else {
                        tmp = 0;   
                    }
                }
            } 
            k--;
        }
        
        return answer;
    }
}