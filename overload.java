class Sums{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void sum(double a, double b){
        System.out.println(a+b);
    }
}

public class overload {
    public static void main(String[] args) {
        Sums obj= new Sums();
        obj.sum(36,33);
        obj.sum(18,18,33);
        obj.sum(33.33,36.36);
    }
}
