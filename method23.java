public class method23 {
    public void twomethods(){
        System.out.println("method without parameter");
    }
    public void firstmethof(){
        System.out.println("metghod with parameter");
    }

    public static void main(String[] args) {
        method23 obj =new method23();
        obj.firstmethof();// object
        obj.twomethods();// call 
        
    }
}