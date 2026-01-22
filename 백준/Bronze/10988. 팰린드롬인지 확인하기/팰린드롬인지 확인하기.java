import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String r = "";
        for(int i=s.length()-1; i>=0; i--) {
            char c = s.charAt(i);
            r += String.valueOf(c);
        }
        if(s.equals(r)) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}