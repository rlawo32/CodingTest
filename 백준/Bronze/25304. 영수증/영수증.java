import java.io.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        int result = 0;
        
        for(int i=0; i<count; i++) {
            String[] product = br.readLine().split(" ");
            int item1 = Integer.parseInt(product[0]);
            int item2 = Integer.parseInt(product[1]);
            result += (item1 * item2);
        }
        
        if(total == result) {
            System.out.println("Yes");   
        } else {            
            System.out.println("No");
        }
    }
}