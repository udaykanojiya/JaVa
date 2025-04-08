import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // byte a =5;
        // System.out.println(a);

        // short b = 128;
        // System.out.println(b);

        // int c = 500;
        // System.out.println(c);

        // long d = 1999000000;
        // System.out.println(d);

        // float e = 575.565f;
        // System.out.println(e );

        // double f = 200.272;
        // System.out.println(f);

        // boolean g = true;
        // System.out.println(g);

        // char h = 'h';
        // System.out.println(h);

        // short k=5;
        // int j=40;
        // byte i= (byte)j;
        // System.out.println(i);

        // double l=40.66;
        // int m = (int)l;

       
        // System.out.println(m);


        int a = 10;
        System.out.println(a);
        float b = (float) a;
        System.out.println(b);

        double c = 10;
        System.out.println(c);
        int d = (int) c;
        System.out.println(d);


        int e =10;
        int temp;
        int f =15;
        temp =e;
        e =f;
        f=temp;

        System.out.println(e);
        System.out.println(f);

        e=e+f;
        f=e-f;
        e=e-f;
        System.out.println(e);
        System.out.println(f);

        int x=5;
        double y= 10;
        System.out.println(x+y);


        Scanner scanner = new Scanner(System.in);
        String u = scanner.nextLine();
        System.out.println(u);
        int z = scanner.nextInt();
        System.out.println(z);

        System.out.println("My name is "+u+" and I am "+z+" years old.");

        char j = 'A';
        int k = j;
        System.out.println("ASCII CODE: "+k);

    
        scanner.close();

    }
}
