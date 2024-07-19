import java.io.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int count = total / 4;
        
        for(int i=0; i<count; i++) {
            System.out.print("long");
            System.out.print(" ");
        }
        
        System.out.println("int");
    }
}