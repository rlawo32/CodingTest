import java.io.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int idx = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i=0; i<len; i++) {
            if(idx == Integer.parseInt(arr[i])) {
                cnt++;
            }
        }
        br.close();

        System.out.println(cnt);
    }
}
        