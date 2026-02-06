import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder totSb = new StringBuilder();
        int line;
        while ((line = Integer.parseInt(br.readLine())) != -1) {
            StringBuilder subSb = new StringBuilder();
            subSb.append(line + " = 1");
            int r = 1;
            for(int i=2; i<line; i++) {
                if(line % i == 0) {
                    r += i;
                    subSb.append(" + " + i);
                }
            }
            if(r != line) {
                subSb.setLength(0);
                subSb.append(line + " is NOT perfect.");
            }
            totSb.append(subSb);
            totSb.append("\n");
        }
        System.out.print(totSb.toString());
    }
}