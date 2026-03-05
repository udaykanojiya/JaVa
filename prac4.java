public class prac4 {
    public static void main(String[] args) {
        int[] arr={1,2,-3,4,-1,-4};

        int temp;
        if(arr[0]>0){
            for(int i=1;i<arr.length;i++){
                if((arr[i]*arr[i-1])<0){
                    continue;
                }
                for(int j=i+1;j<arr.length;j++){
                    if((arr[i]*arr[j])<0){
                        temp= arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        break;
                    }
                }
            }
        }

        for(int num : arr){
            System.out.println(num);
        }
    }
}
