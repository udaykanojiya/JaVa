public class thread3 {
    public static void main(String[] args) {
        Runnable r = new Runnable(){
            public void run(){
                System.out.println("Runnable using Anonymous Class");
            }
            
        };
        r.run();
    }
}

// public class thread3{
//     public static void main(String[] args){
//         Runnable r = () -> System.out.println("Runnable using Lambda Class");
//         r.run();
//     }
// }
