import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[42];

        for (int i = 0; i < 10; i++) {
            int input = Integer.parseInt(br.readLine());
            int remainder = input % 42;
            arr[remainder] = 1;
        }

        int count = 0;
        for (int i = 0; i < 42; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }
        
        System.out.println(count);
        br.close();
    }
}