import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N + 1];
        int temp = 0;
        
        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }
        
        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
        
        br.close();
    }
}