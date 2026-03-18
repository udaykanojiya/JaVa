package javainonevideo.datatypes;

import java.util.Scanner;

public class op {
    public static void main(String[] args) {

        // int n=5;
        // boolean x = n%2 == 0 ? true : false;
        // System.out.println(x);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the grade: ");
        int grade = sc.nextInt();

        int encryptedGrade = (grade + 8 )/10;
        System.out.println("Encrypted grade: " + encryptedGrade);

        int decryptedGrade = (encryptedGrade * 10) - 8;
        System.out.println("Decrypted grade: " + decryptedGrade);

        sc.close();

        
    }

}
