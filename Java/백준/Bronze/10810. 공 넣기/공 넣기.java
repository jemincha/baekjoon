import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N + 1];

        for (int m = 0; m < M; m++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int ballNum = sc.nextInt();

            for (int index = start; index <= end; index++) {
                arr[index] = ballNum; 
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}