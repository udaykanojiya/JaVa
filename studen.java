class student {

//     String name="astha";
//     int age=19;
//     student( String s,int a){
//         name=s;
//         age=a;
//         System.out.println(name+  " "   +age);
//     }
// }
// class studen{


// public static void main(String[] args) {
//     student obj=new student("asth",29);

// }
// }


String s= "astha";
int a=19;
student(){
    System.out.println("hello");
}
student(String s){
    this();
    System.out.println(s);

}

student(String s,int a){
    this(s);
 this.s=s;
 this.a=a;
 System.out.println(s+" "+a);
}
}
class studen{
    public static void main(String[] args) {
        student obj=new student("ram", 34);
        System.out.println(obj.s);
        System.out.println(obj.a);
        
    }
}