import java.io.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) {
            String[] values = br.readLine().split(" ");
            int val1 = Integer.parseInt(values[0]);
            int val2 = Integer.parseInt(values[1]);
            
            int sum = val1 + val2;
            if(sum > 0) {
                bw.write(sum + "\n");
            } else {
				break;
			}
        }
       
        br.close();

        bw.flush();
        bw.close();
    }
}