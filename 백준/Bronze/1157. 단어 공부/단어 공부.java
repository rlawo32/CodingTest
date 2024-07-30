import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] arr2 = new int[26];
        String str = br.readLine().toLowerCase();
        String res = "?";
        int idx = 0;
        
        for(char c : arr) {
            int len1 = str.length();
            if(len1 < 1) {
                break;
            }
            int len2 = str.replace(String.valueOf(c), "").length();
            arr2[idx++] = len1 - len2;
        }
        
        int max = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr2[i] > max) {
                max = arr2[i];
				idx = i;
            } 
        }

		for(int i=0; i<arr.length; i++) {
            if(idx != i && arr2[i] == max) {
				max = -1;
                break;
            } 
        }

		if(max > 0) {
			res = (arr[idx]+"").toUpperCase();
		}  
        
        bw.write(res);
        
        bw.flush();
        bw.close();
    }
}