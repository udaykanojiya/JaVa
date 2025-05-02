public class method24 {
    public int firstmethod(int a,int b){
        return a+b;
    }
    public int secondmethod(int x,int y ,int z){
        return x*y*z;
    }
    public static void main(String[] args) {
        method24 obj=new method24();
       int first=  obj.firstmethod(5, 10);
      int second=  obj.secondmethod(2, 3, 4);
        System.out.println(first);
        System.out.println(second);

        
    }
}
