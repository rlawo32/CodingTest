import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int res = 0;
        
        for(int i=0; i<10; i++) {
            int cnt = 0;
            int a = Integer.parseInt(br.readLine());
            int b = a % 42;
            
            for(int j : arr) {
                if(b == j) {
                    cnt++;
                    break;
                } 
            }
            
            if(cnt == 0) {
                arr[i] = b;
            }
        }
        
        br.close();
        
        for(int i : arr) {
            if(i != -1) {
                res++;
            }
        }
        
        bw.write(String.valueOf(res));
        bw.flush();
        bw.close();
    }
}