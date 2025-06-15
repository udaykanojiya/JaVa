public class prac12 {
    public static void main(String[] args) {
        
        String str = "abbabba";
        int len = str.length();

        int pal=1;
        for(int i=0,j=len-1; i<(len/2)&&j>len/2;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                pal=0;
                break;
            }
        }
        if(pal==1){
            System.out.println("Yes, Palindrome");
        }else{
            System.out.println("NO, not a Palindrome");
        }
    }
}

