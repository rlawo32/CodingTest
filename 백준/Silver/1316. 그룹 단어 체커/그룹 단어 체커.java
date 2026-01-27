import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=0; i<n; i++) {
            Map<String, Integer> map = new HashMap<>();
            String s = br.readLine();
            for(int j=0; j<s.length(); j++) {
                String t = String.valueOf(s.charAt(j));
                if(map.containsKey(t)) {
                    int x = map.get(t);
                    if((j-x)>1) {
                        cnt++;
                        break;   
                    }              
                }
                map.put(t, j);
            }
        }
        System.out.print(n-cnt);
    }
}