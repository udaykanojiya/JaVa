package javainonevideo.datatypes;

public class condition {
    public static void main(String[] args){
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        if(isJavaFun){
            System.out.println("Java is fun!");
        } else {
            System.out.println("Java is not fun.");
        }

        if(isFishTasty){
            System.out.println("Fish is tasty!");
        } else {
            System.out.println("Fish is not tasty.");
        }

         int b = 4;
        int a = 7%b == 4 ? 10 : 20;
        System.out.println(a);
    }

    
}
