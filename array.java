public class array {
    public static void main(String[] args) {
        int[] arr={1,3,2,4,5,6};
        for(int i=0;i<arr.length;i++){
            if(i<arr.length-1)
            System.out.print(arr[i] + " ,");
            else System.out.print(arr[i]);
        }
        
    }

}
