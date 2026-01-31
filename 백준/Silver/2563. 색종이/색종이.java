import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] paper = new boolean[100][100];
        int totalCount = 0;
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int j=a; j<a+10; j++) {
                for(int k=b; k<b+10; k++) {
                    if(!paper[j][k]) {
                        paper[j][k] = true;
                        totalCount++;
                    }
                }
            }
        }
        System.out.print(totalCount);
    }
}