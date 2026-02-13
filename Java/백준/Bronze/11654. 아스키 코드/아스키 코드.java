import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        char ch = input.charAt(0);
        System.out.println((int)ch);
        
        
        br.close();
    }
}