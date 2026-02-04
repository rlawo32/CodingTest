import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = {25, 10, 5, 1};
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            int m = Integer.parseInt(br.readLine());
            for(int j=0; j<arr.length; j++) {
                int k = m / arr[j];
                sb.append(k + " ");
                m %= arr[j];
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}