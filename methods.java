import java.util.Scanner;
public class methods{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number ");
    int x= sc.nextInt();

     
    if(x%2==0){
        System.out.println("number is prime");
    }
    else {
        System.out.println("not a prime number");
    }

    primenum(x);

}

  static void primenum(int x){
}
} 
    

