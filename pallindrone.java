
public class pallindrone {
    public static void main(String[] args) {
      int a=171;
      int original=a;
      int rev=0;
      while(a>0){
        int digits=a%10;
        rev=rev*10+digits;
        a=a/10;
      }
      if(original==rev){
        System.out.println("palindrone");
      }
      else{
        System.out.println("error");
      }
    }
}
