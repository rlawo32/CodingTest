import java.io.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        
        int hour = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[1]);
        
        if(min < 45) {
            hour --;                              // 45보다 작을시 시간을 -1
            min = 60-(45-min);

            if(hour < 0) {
                hour = 23;                        // 0 보다 작을시 23시로
            }
            System.out.println(hour + " " + min);
        } else {
            System.out.println(hour + " " + (min - 45));
        }
    }
}