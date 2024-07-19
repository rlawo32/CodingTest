import java.io.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=count; i++) {
            String[] values = br.readLine().split(" ");
            int val1 = Integer.parseInt(values[0]);
            int val2 = Integer.parseInt(values[1]);
            bw.write("Case #" + i + ": " + val1 + " + " + val2 + " = " + (val1 + val2) + "\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}