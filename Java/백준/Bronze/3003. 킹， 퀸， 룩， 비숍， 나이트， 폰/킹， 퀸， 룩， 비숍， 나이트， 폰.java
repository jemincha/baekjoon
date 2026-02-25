import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int[] origin = {1, 1, 2, 2, 2, 8};
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < 6; i++) {
            int input = Integer.parseInt(st.nextToken());
            int diff = origin[i] - input;
            
            sb.append(diff).append(" ");
        }
        
        System.out.println(sb.toString().trim());
        br.close();
    }
}