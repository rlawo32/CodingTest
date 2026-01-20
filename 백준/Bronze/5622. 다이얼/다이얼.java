import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        int r = 0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            for(int j=0; j<arr.length; j++) {
                if(arr[j].indexOf(c) != -1) {
                    r += j+3;
                    break;
                }
            }
        }
        System.out.print(r);
    }
}