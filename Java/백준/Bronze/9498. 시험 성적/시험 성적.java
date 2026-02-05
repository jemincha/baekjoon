import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Score = sc.nextInt();
        
        if(Score >= 90 ) {
            System.out.println("A");
        } else if (89 >= Score && Score >= 80){
            System.out.println("B");
        } else if (79 >= Score && Score >= 70){
            System.out.println("C");
        } else if (69 >= Score && Score >= 60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        
        sc.close();
    }
}