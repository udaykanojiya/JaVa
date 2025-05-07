class Parent{
    void sum(int a){
        System.out.println(a);
    }

    void sum(int a, int b){
        System.out.println(a+b);
    }
}

public class poly {
    public static void main(String[] args)
     {
        Parent obj= new Parent();
        obj.sum(69);
        obj.sum(33,36);

    }
}
