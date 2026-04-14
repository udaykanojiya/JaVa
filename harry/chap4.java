package harry;
import java.util.*;

public class chap4 {
    public static void main(String[] args) {
        // float a;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter you Annual Imcome (in Lakhs): ");
        // a = sc.nextFloat();

        if(a<2.5){
            System.out.println("No Tax to be paid below 2.5L");
        }
        else if(a<5.0){
            System.out.println("Tax charges will be: "+ (a*100/100)*5 + "Thousand");
        }else if(a<10){
            System.out.println("Tax charges will be: "+ (a*100/100)*20 + "Thousand");
        }else{
            System.out.println("Tax charges will be: "+ (a*100/100)*30 + "Thousand");
        }

    }
}
