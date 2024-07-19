import java.io.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++) {
            String[] N = br.readLine().split(" ");
            int a = Integer.parseInt(N[0]);
            int b = Integer.parseInt(N[1]);
            System.out.println(a+b);
        }
    }
}