public class prac9 {
    public static void main(String[] args) {
        int[] arr1={1,2,4,5,6};
        int[] arr2 = {2,3,5,7};

        int i=0,j=0;
        System.out.println("Intersection : ");

        while(i< arr1.length && j< arr2.length){
            if(arr1[i]==arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                i++;
            }
        }
    }
}
