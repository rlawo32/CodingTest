import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[9];
        
        for(int i=0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        br.close();
        
        int tmp1 = arr[0];
        int tmp2 = 1;
        
        for(int i=1; i<9; i++) {
            if(tmp1 < arr[i]) {
                tmp1 = arr[i];
                tmp2 = i+1;
            } 
        }
        
        bw.write(tmp1+"\n"+tmp2);
        bw.flush();
        bw.close();
    }
}