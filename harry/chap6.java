package harry;
import java.util.Scanner;

public class chap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of rows:");
        // int rows = sc.nextInt();
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        float[] marks = {1,2,3,4,5};
            for (float element : marks) {
                System.out.println(element);
            }

        sc.close();
    }
}