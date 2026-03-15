package javainonevideo.datatypes;

public class str {
    public static void main(String[] args) {
        String name = "java in one in video in";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.contains("in"));
        System.out.println(name.startsWith("java"));
        System.out.println(name.endsWith("in"));
        System.out.println(name.equals("java in one in video in"));
        System.out.println(name.equalsIgnoreCase("JAVA IN ONE IN VIDEO IN"));
        System.out.println(name.charAt(5));
        System.out.println(name.indexOf("in"));
        System.out.println(name.lastIndexOf("in"));
        System.out.println(name.replace("in", "on"));
        System.out.println(name.substring(0, 4));
        name = name.toUpperCase();
        System.out.println(name);
    }
}
