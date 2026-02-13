import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int[] alphabet = new int[26];

        for (int i = 0; i < 26; i++) {
            Arrays.fill(alphabet, -1);
        }

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            int idx = ch - 'a';

            if (alphabet[idx] == -1) {
                alphabet[idx] = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int val : alphabet) {
            sb.append(val).append(" ");
        }
        System.out.println(sb.toString().trim());

        br.close();
    }
}