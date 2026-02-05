import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        if (A == B && B == C) {
            // 1. 세 숫자가 모두 같은 경우
            System.out.println(10000 + A * 1000);
        } else if (A == B || A == C) {
            // 2. 두 숫자가 같은 경우 (A가 포함된 경우)
            System.out.println(1000 + A * 100);
        } else if (B == C) {
            // 3. 두 숫자가 같은 경우 (B와 C가 같은 경우)
            System.out.println(1000 + B * 100);
        } else {
            // 4. 모두 다른 경우
            // Math.max를 중첩하여 세 수 중 최댓값을 찾음
            int max = Math.max(A, Math.max(B, C));
            System.out.println(max * 100);
        }
        
        sc.close();
    }
}