import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            String str = br.readLine();
            sb.append(str.substring(0,1)+str.substring(str.length()-1,str.length())).append("\n");
        }
        System.out.print(sb);
    }
}