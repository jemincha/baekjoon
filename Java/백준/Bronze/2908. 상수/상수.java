import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String strA = st.nextToken();
        String strB = st.nextToken();

        int numA = Integer.parseInt(new StringBuilder(strA).reverse().toString());
        int numB = Integer.parseInt(new StringBuilder(strB).reverse().toString());

        System.out.println(Math.max(numA, numB));

        br.close();
    }
}