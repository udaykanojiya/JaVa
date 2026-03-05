public class string4 {
    public static void main(String[] args) {
        String str="hello";
        String newstr="";
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(newstr.indexOf(ch)==-1){
                newstr+=ch;
            }
        }
        System.out.println(newstr);
    }
}
