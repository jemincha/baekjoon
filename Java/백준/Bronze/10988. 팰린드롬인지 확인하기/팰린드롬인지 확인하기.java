import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length();

        int result = 1;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                result = 0;
                break;
            }
        }

        System.out.println(result);
        br.close();
    }
}