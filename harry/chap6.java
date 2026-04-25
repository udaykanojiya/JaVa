package harry;
import java.util.Scanner;

public class chap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        float[] marks = {1,2,3,4,5};
        float sum = 0;
            for (float element : marks) {
                sum = sum + element;
                // System.out.println(element);
            }
        System.out.println("Sum of marks: " + sum);

        int x = 3;
        for (float element : marks) {

            if(element == x) {
                System.out.println(("Element found: " + element));
                break;

            }

        }

        // float sum = 0;
        // for(int i=0; i < marks.length; i++){
        //     sum = sum + marks[i];
            
        // }

        //     System.out.println("Average of marks: " + (sum/50)*10);

        // int[][]   a,b;
        // a = new int[][]{{1,2,3},{4,5,6}};
        // b = new int[][]{{7,8,9},{10,11,12}};

       
        // for( int i=0;i<a.length;i++){
        //     for(int j=0;j<a[i].length;j++){
        //         System.out.print(a[i][j] + b[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        int[] a = {1,2,3,4,5};

            for(int i = 0; i < a.length/2; i++){
                int temp = a[i];
                a[i] = a[a.length - 1 - i];
                a[a.length - 1 - i] = temp;}

            for(int element : a){
                System.out.print(element + " ");    }

            int max = a[0];
            int min = a[0];
            for(int i=1;i<a.length;i++){
                if(a[i]> max){
                    max = a[i];
                }
                if(a[i]< min){
                    min = a[i];
                }
            }
            System.out.println("Maximum element: " + max);
            System.out.println("Minimum element: " + min);

            // chap6 m = new chap6();
            // m.first(1,2,3,3);
            //     System.out.println(first(5));

            
            // pattern(7);
                // System.out.println(nat(5));

          sc.close();
        //   System.out.println(fib(5));
    }

    // static void table(int n){
    //     for(int i=0;i<=10;i++){
    //         System.out.println(n + " x " + i + " = " + n*i);
    //     }
    // }

    //      static void pattern(int n){
    //         for(int i=1;i<=n;i++){
    //             for(int j=n-i;j>=0;j--){
    //                 System.out.print("*" + " ");
    //             }
    //             System.out.println();
    //         }
    
    // static int nat(int n){
    //     if(n==1){
    //         return 1;
    //     }
    //     else{
    //         return n + nat(n-1);
    //     }
    // }

    static int first(int x){
        if(x==0 || x==1){
            return 1;
        }
        else{
            return x * first(x-1);
        }
    }

    // static int fib(int n){
    //     if(n==0){
    //         return 0;
    //     }
    //     else if(n==1){
    //         return 1;
    //     }
    //     else{
    //         return fib(n-1) + fib(n-2);
    //     }
    // }
}