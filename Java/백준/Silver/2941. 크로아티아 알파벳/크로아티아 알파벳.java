import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] croatianAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < croatianAlphabets.length; i++) {
            s = s.replace(croatianAlphabets[i], "*");
        }

        int len = s.length();

        System.out.println(len);
        
        br.close();
    }
}