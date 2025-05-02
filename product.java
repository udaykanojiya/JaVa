public class product{
    static int mul=1;;
    static void multiply(int n){
        for(int i=1;i<=n;i++){
           mul=mul*i;
        }
       System.out.println(mul);
    }
    public static void main(String[] args) {
  int n=5;
  multiply(n);
}
    
}
