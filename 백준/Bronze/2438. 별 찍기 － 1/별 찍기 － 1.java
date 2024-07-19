import java.io.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=count; i++) {
            String star = "";
            for(int j=0; j<i; j++) {
                star += "*";
            }
            bw.write(star + "\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}