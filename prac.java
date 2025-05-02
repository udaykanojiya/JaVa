// DATE : 9/04/2025

import java.util.Scanner;

public class prac {


    public static void main(String[] args) {
        System.out.println("Practice");
        

         Scanner scanner = new Scanner(System.in);

    //     int a;

    //     switch (a) {
    //         case 1:
    //             System.out.println("Monday");
    //             break;
    //         case 2:
    //             System.out.println("Tuesday");
    //             break;
    //         case 3:
    //             System.out.println("Wednesday");
    //             break;
    //         case 4:
    //             System.out.println("Thursday");
    //             break;
    //         case 5:
    //             System.out.println("Friday");
    //             break;
    //         case 6:
    //             System.out.println("Saturday");
    //             break;
    //         case 7:
    //             System.out.println("Sunday");
    //             break;

    //         default:
    //             System.out.println("Invalid Input");
    //             break;
    //     }

    // }

    // System.out.println("Enter first number: ");
    // int a = scanner.nextInt();
    // System.out.println("Enter first number: ");
    // int b = scanner.nextInt();
    // System.out.println("Enter operator: ");
    // int o = scanner.next().charAt(0);

    // switch(o){
    //     case '+': System.out.println("Sum: " + (a+b));
    //     break;
    //     case '-': System.out.println("Diff: " + (a-b));
    //     break;
    //     case '*': System.out.println("Mul: " + (a*b));
    //     break;
    //     case '/': System.out.println("Div: " + (a/b));
    //     break;
    //     default:
    //     System.out.println("Invalid operator.");

    // }


    System.out.println("Enter a no. between 0-9: ");
    int a = scanner.nextInt();

    switch (a) {
        case 1:System.out.println("One");
            break;

            case 2:System.out.println("Two");
            break;

            case 3:System.out.println("Three");
            break;

            case 4:System.out.println("Four");
            break;

            case 5:System.out.println("Five");
            break;

            case 6:System.out.println("Six");
            break;

            case 7:System.out.println("Seven");
            break;

            case 8:System.out.println("Eight");
            break;

            case 9:System.out.println("Nine");
            break;

            case 0:System.out.println("Zero");
            break;
    
        default:System.out.println("Invalid Input");
            break;
    }

    scanner.close();
    

    }

}
