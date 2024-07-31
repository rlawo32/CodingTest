import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] arr1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int len = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=0; i<len; i++) {
            int[] arr2 = new int[26];
            String str = br.readLine();
			char c = '!';
            Loop1 : for(int j=0; j<str.length(); j++) {
                if(c != str.charAt(j)) {
                    c = str.charAt(j);
                    for(int k=0; k<arr1.length; k++) {
                        if(c == arr1[k]) {
                            if(arr2[k] > 0) {
                                cnt += 1;
                                break Loop1;
                            } else {
                                arr2[k] = 1;   
                            }
                        }
                    }
                }
	        }
        }
        br.close();
        bw.write(len-cnt+"");
        bw.flush();
        bw.close();
    }
}