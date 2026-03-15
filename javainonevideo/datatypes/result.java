package javainonevideo.datatypes;

import java.util.Scanner;

public class result{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your marks: ");
      String marks = sc.nextLine().toUpperCase();
      System.out.println("Your marks are: " + marks);
      sc.close();
    

    }
}
