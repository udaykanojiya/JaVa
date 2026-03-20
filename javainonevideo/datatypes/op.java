package javainonevideo.datatypes;
import static java.lang.Math.pow;

import java.util.Scanner;

public class op {
    public static void main(String[] args) {

        // int n=5;
        // boolean x = n%2 == 0 ? true : false;
        // System.out.println(x);

        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the grade: ");
        // int grade = sc.nextInt();

        // int encryptedGrade = (grade + 8 )/10;
        // System.out.println("Encrypted grade: " + encryptedGrade);

        // int decryptedGrade = (encryptedGrade * 10) - 8;
        // System.out.println("Decrypted grade: " + decryptedGrade);

        System.out.println("Enter v,u,a and s: ");
        int v = sc.nextInt();
        int u = sc.nextInt();   
        int a = sc.nextInt();
        int s = sc.nextInt();
        int finalv = ((v*v) - (u*u))/(2*a*s);
        float finalv2 = (float)((pow(v,2)-pow(u,2)))/(2*a*s);
        System.out.println("Final velocity: " + finalv);
        System.out.println("Final velocity: " + finalv2);

        sc.close();

        
    }

}
