

class Parent{
    void sum(int a){
        System.out.println(a);
    }

    void sum(int a, int b){
        System.out.println(a+b);
    }
}

abstract class Payment{
int a = 5;
 abstract void pay();
}

class UpiPayment extends Payment {
    void pay(){
        System.out.println('A');
    }

    
}

public class poly {

    static int a=5;
    static int b=5;
    int c=5;
    int d=5;
    public static void main(String[] args)
     {
          int sum =a+b;
          System.out.println(sum);

        poly obj3 = new poly();
        System.out.println(obj3.c+obj3.d);
        
        Parent obj= new Parent();
        obj.sum(69);
        obj.sum(33,36);

        Payment obj1 = new UpiPayment();
        obj1.pay();


    }
}
