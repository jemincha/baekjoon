import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int index = 0;

        for (int i = 1; i <= 9; i++) {
            int current = sc.nextInt();
            
            if (current > max) {
                max = current;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
               
        sc.close();
    }
}