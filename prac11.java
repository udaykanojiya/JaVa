public class prac11{
     public static void main(String[] args) {
        
        String str = "hello";
        String reverse = "";
        // // System.out.println(str[1]);
        // System.out.println(str.charAt(0));

        // for(int i=str.length()-1;i>=0;i--){
        //     reverse += str.charAt(i);

        // }

        reverse = new StringBuilder(str).reverse().toString();

        System.out.println("Reversed: "+reverse);

    }
}