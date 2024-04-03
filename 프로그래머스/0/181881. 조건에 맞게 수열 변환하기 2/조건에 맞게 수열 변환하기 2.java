class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] copy = new int[arr.length];
        int check = 0;
        
        while(check == 0) {
            for(int i=0; i<arr.length; i++) {
                copy[i] = arr[i];
            }
            
            
            for(int i=0; i<arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                } else if(arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = (arr[i] * 2) + 1;
                }
            }
            
            check = 1;
            
            for(int i=0; i<arr.length; i++) {
                if(copy[i] != arr[i]) {
                    answer++;
                    check = 0;
                    break;
                }
            }
        }
        return answer;
    }
}