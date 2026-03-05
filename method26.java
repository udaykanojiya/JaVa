public class method26 {
    public void java(){
        System.out.println("java programming");
    }
    public String java2(String name){
        return "welcome to "+ name;
    }
    public static void main(String[] args) {
        method26 obj=new method26();
        obj.java();
       String write= obj.java2("Welcome to Java Programming");
       System.out.println(write);
        
    }
}
