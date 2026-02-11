import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int max = 0;
        double sum = 0;

        for (int i = 0; i < N; i++) {
            int score = Integer.parseInt(st.nextToken());
            if (score > max) {
                max = score;
            }
            sum += score;
        }
        
        double avg = (sum / max) * 100 / N;
        System.out.println(avg);
        
        br.close();
    }
}