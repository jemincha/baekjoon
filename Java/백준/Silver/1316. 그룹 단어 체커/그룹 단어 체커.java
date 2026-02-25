import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (isGroupWord(s)) {
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }

    public static boolean isGroupWord(String s) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        boolean[] isVisited = new boolean[26];
        int prev = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int now = s.charAt(i);
            
            if (prev != now) {
                if (isVisited[now - 'a'] == true) {
                    return false;
                }
                else {
                    isVisited[now - 'a'] = true;
                    prev = now;
                }
            }
        }
       
        return true;
    }
}