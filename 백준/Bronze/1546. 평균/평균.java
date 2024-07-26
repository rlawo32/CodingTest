import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        double[] arr = new double[N];
		double max = 0;
		double avg = 0;
        
        st = new StringTokenizer(br.readLine(), " ");
        
        br.close();
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		for(int j=0; j<arr.length; j++) {
			avg += (arr[j]/max*100)/N;
		}
        
        bw.write(avg+"\n");
        bw.flush();
        bw.close();
    }
}