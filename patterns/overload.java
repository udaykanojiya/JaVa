class Parent{
    void sum(){
        System.out.println(69);
    }
    void sum(int a){
        System.out.println(a+69);
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }
}

public class overload {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.sum();
        obj.sum(1);
        obj.sum(33,36);
    }
}
