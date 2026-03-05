
    

import java.util.Scanner;

public class conditionalst {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int operator=sc.nextInt();
        int sum=a+b;
        int multiply=a*b;
        int division=a/b;


        switch(operator)
        {
            case 1:
                System.out.println(sum);
               break;


            case 2:
                System.out.println(multiply);
                break;

            case 3:
                System.out.println(division);
                break;
        }
    }
}
