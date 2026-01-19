import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};        
        for(int i=0; i<s.length(); i++) {
            String str = s.substring(i, i+1);
            for(int j=0; j<arr.length; j++) {
                if(arr[j].equals(str)) {
                    arr[j] = "*"+i;
                    break;
                }
            }
        }
        for(int i=0; i<arr.length; i++) {
            if(arr[i].length() > 1) {
                arr[i] = arr[i].substring(1);
            } else {
                arr[i] = "-1";
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            sb.append(arr[i] + " ");
        }
        System.out.print(sb);
    }
}