import java.util.Scanner;

public class posnegzero {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
       
        if(a>0){
            System.out.println("number is positive");
        }
        else if(a<0){
            System.out.println("number is negative");
        }
        else{
            System.out.println("number is zero");
        }
    }
}
