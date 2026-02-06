import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = 0;
        int k = 0;
        int i = 1;
        while (true) {
            n -= i;
            if(n <= 0) {
                m = i;
                k = n+i;
                break;
            }
            i++;
        }
        int a = 0;
        int b = 0;
        if(m % 2 == 0) {
            a = 0;
            b = m+1;
        } else {
            a = m+1;
            b = 0;    
        }
        for(int j=0; j<k; j++) {
            if(m % 2 == 0) {
                a++;
                b--;
            } else {
                a--;
                b++;
            }
        }
        System.out.print(a + "/" + b);
    }
}