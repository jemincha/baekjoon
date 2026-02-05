import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        int HtoM = H * 60 + M;
        HtoM -= 45;
        
        if (HtoM < 0) {
            HtoM += 24 * 60;
        }
        H = HtoM / 60;
        M = HtoM % 60;
        
        System.out.println(H + " " + M);
        sc.close();
    }
}