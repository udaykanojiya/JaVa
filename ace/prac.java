package ace;
import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the pattern:");
        String pattern = sc.next();
        System.out.println("Pattern: " + pattern);
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(pattern + " ");
            }
            System.out.println();
        }
    }
    
}
