class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] temp = new double[score.length];
        int idx = 0;
        for(int[] i : score) {
            double tmp = (double) (i[0] + i[1]) / 2;
            temp[idx++] = tmp;
        }
        for(int i=0; i<temp.length; i++) {
            int rank = 1;    
            for(int j=0; j<temp.length; j++) {
                if(temp[i] < temp[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }
}