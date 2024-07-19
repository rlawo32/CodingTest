import java.io.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        
        for(int i=count; i>=1; i--) {
            String star = "";
            for(int j=0; j<count; j++) {
                if(j >= (i-1)) {
                    star+= "*";
                } else {
                    star+= " ";
                }
            }
            bw.write(star + "\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}