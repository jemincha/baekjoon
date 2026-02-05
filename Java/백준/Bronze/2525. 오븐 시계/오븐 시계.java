import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int HtoM = A * 60 + B;
        HtoM += C;
        
        if (HtoM >= 1440) {
            HtoM -= 1440;
        }
        
        int H = HtoM / 60;
        int M = HtoM % 60;
        
        System.out.println(H + " " + M);
        sc.close();
    }
}