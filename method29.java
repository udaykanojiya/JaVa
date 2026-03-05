public class method29 {
    public void calculation(int a,int b){
        System.out.println("Sum : " + (a+b));
        System.out.println("Multiplication "+  (a*b));
        System.out.println("Division :" + (double)a/b);
        System.out.println("Modulud : "  +(a%b));
    }
    public static void main(String[] args) {
        
        method29 obj=new method29();

        obj.calculation(10,5);
    }
}
