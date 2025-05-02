//single inheritance

// class employee {
//     void work(){
//         System.out.println("working");
//     }
// }
// class manager extends employee{
//     void attendmetting(){
//         System.out.println("attended meetingg");
//     }
// }





// public class inheritance1 {
//     public static void main(String[] args) {
//         manager obj=new manager();
//         obj.attendmetting();
//         obj.work();
//     }
// }



/// multilevel inheritance
// class person{
//     void displayname(){
//         System.out.println("astha");
// }
// }
// class student extends person{
//     void checkdiscipline(){
//         System.out.println("attended");
//     }
// }
// class monitor extends student{
//     void displayclass(){
//         System.out.println("discipline");
//     }
// }
// public class inheritance1 {
//         public static void main(String[] args) {
//             monitor obj=new monitor();
//             obj.displayclass();
//             obj.checkdiscipline();
//             obj.displayname();
//         }


//     }



// class shape{
//     void draw(){
//         System.out.println("drawing");
//     }
// }
// class circle extends shape{
//     void calculatedarea(){
//         System.out.println("area");

//     }
// }
// public class inheritance1 {
//             public static void main(String[] args) {
//                 circle obj=new circle();
//                 obj.calculatedarea();
//                 obj.draw();
//             }



        
//         }
    
// multilevel inheritance

// class device{
//         void poweron(){
//             System.out.println("astha");
//     }
//     }
//     class laptop extends device{
//         void boot(){
//             System.out.println("attended");
//         }
//     }
//     class gaming extends laptop{
//         void startgame(){
//             System.out.println("discipline");
//         }
//     }
//     public class inheritance1 {
//             public static void main(String[] args) {
//                   gaming obj=new gaming();
//                 obj.startgame();
//                 obj.poweron();
//                 laptop obj1=new laptop();
//                 obj1.boot();
//                 obj1.poweron();
//             }
    
    
//         }
    



//single inheritance


        class book{
                void read(){
                    System.out.println("working");
                }
            }
            class novel extends book{
                void storyline(){
                    System.out.println("attended meetingg");
                }
            }
            
            
            
            
            
            public class inheritance1 {
                public static void main(String[] args) {
                    novel obj=new novel();
                    obj.read();
                    obj.storyline();
                }
            }