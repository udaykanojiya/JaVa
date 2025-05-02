
    public class string {
        public static void main(String[] args) {
            String s1 ="hello";
            String s2="world";
            System.out.println(s1.charAt(0));
            System.out.println(s1.compareTo(s2));
            System.out.println(s1.equals(s2));
            System.out.println(s1.contains(s2)) ;//output-> true when it contains  a char else false
            System.out.println(s1.indexOf("he"));
            System.out.println(s1.toLowerCase());
            System.out.println(s1.substring(2,s1.length()));
            System.out.println(s1.length());
            System.out.println(s1.startsWith("$"));
            System.out.println(s1.endsWith("s"));
            System.out.println(s1.replace('h','o'));
            String str="Hello world Iam here";
          String words []=str.split(" ");
            for(int i=0;i<words.length;i++)
            System.out.print(words[i]+"|");
            System.out.println("    hello".trim());
            String x="hello";
            char [] arr=x.toCharArray();
            System.out.println(arr[4]);
    
    
        }
    }
    
    

