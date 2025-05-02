

class animal{
    void eat(){
        System.out.println("eatinggg");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("barkinggg");

}
}
class puppy extends dog{
  void cutie(){
    System.out.println("cutenesss");
  }
}
 public class inheritance{

    public static void main(String[] args) {
        puppy obj=new puppy();
        obj.bark();
        obj.eat();
        obj.cutie();
       
        

    }
   }

