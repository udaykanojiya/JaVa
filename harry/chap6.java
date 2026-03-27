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
        // float sum = 0;
        //     for (float element : marks) {
        //         sum = sum + element;
        //         // System.out.println(element);
        //     }
        // System.out.println("Sum of marks: " + sum);

        // int x = 3;
        // for (float element : marks) {

        //     if(element == x) {
        //         System.out.println(("Element found: " + element));
        //         break;

        //     }

        // }

        float sum = 0;
        for(int i=0; i < marks.length; i++){
            sum = sum + marks[i];
            
        }

            System.out.println("Average of marks: " + (sum/50)*10);
        sc.close();
    }
}