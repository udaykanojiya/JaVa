public class method21 {
    public void print(){ // non static
        System.out.println("this is a non static method");
    }
    public static void main(String[] args) {
        
    method21 obj=new method21(); // method21 ek constructor haii jo method21 class ka object banata haii
    obj.print(); //  calling the non static method
    }
}
