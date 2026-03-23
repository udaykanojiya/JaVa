package harry;
import java.util.*;

public class calci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 no: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Choose operator: \n+ - * /");
        String c = sc.next();
          switch(c){
            case "+" :
                System.out.println("Result: " + (a + b));
                break;
            case "-" :
                System.out.println("Result: " + (a - b));
                break;
            case "*" :
                System.out.println("Result: " + (a * b));
                break;
            case "/" :
                if(b != 0){
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
                break;
         }
         sc.close();

    }
}