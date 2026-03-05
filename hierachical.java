
class employee{
    void job(){
        System.out.println("job ");
    }
}
class programmer extends employee{
    void  program(){
        System.out.println("programming");
    }
}
class manager extends employee{
    void manages(){
  System.out.println(" managinggg");
}
}

public class hierachical {
    public static void main(String[] args) {
        programmer obj1=new programmer();
          obj1.program();
          obj1.job();

        manager obj=new manager();
           obj.manages();
    
           obj.job();

        
    }
}
