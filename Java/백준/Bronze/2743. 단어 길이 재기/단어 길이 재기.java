import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        int strlen = S.length(); 
        System.out.println(strlen);

        br.close();
    }
}