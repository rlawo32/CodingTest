import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double result = 0;
        double total = 0;
        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();            
            switch(grade) {
                case "A+": result += score * 4.5; break;
                case "A0": result += score * 4; break;
                case "B+": result += score * 3.5; break;
                case "B0": result += score * 3; break;
                case "C+": result += score * 2.5; break;
                case "C0": result += score * 2; break;
                case "D+": result += score * 1.5; break;
                case "D0": result += score * 1; break;
                case "F": result += score * 0; break;
                default: result += 0; break;
            }
            if(!grade.equals("P")) {
                total += score;
            }
        }
        System.out.print(result/total);
    }
}