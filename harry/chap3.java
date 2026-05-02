package harry;

public class chap3{
    public static void main(String[] args) {
        // String a = "UdAy";
        // String b = a.toLowerCase();
        // System.out.println(a + " " + b);

        String c = "Uday is a good boy";
        String d = c.replace(" ", "_");
        System.out.println(c+ " "+ d);
        // c = c.replace(" ", "%");
        System.out.println(c);

        if(c.contains(" ")){
            System.out.println("contain single spaces");
        }else{
            System.out.println("no");
        }

        String e = "Dear Uday,\nWe are good to see you \"here\".\nThank You.";
        System.out.println(e);
    }
}