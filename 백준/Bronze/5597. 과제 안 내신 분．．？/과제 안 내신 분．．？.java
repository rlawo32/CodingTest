import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr1 = new int[30];
        int[] arr2 = new int[28];
        
        for(int i=0; i<30; i++) {
            arr1[i] = i+1;
        }
        
        for(int i=0; i<28; i++) {
            arr2[i] = Integer.parseInt(br.readLine());
        }
        
        br.close();
        
        for(int i=0; i<arr1.length; i++) {
            for(int j : arr2) {
                if(arr1[i] == j) {
                    arr1[i] = 0;
                }
            }
        }
        
        int[] arr3 = new int[2];
        int idx = 0;
        
        for(int i : arr1){
            if(i != 0) {
                arr3[idx++] = i;
            }
        }
        
        if(arr3[0] > arr3[1]) {
            bw.write(arr3[1]+"\n"+arr3[0]); 
        } else {
            bw.write(arr3[0]+"\n"+arr3[1]);
        }
        
        bw.flush();
        bw.close();
    }
}