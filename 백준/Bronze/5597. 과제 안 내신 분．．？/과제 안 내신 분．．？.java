import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            list.add(Integer.parseInt(line));
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(int i=1; i<=30; i++) {
            if(!list.contains(i)) {
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }
}