import java.util.ArrayList;

public class prac6 {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5,15,23,21};
        ArrayList<Integer> ans = new ArrayList<>();

        int kt = 38;
        int success=0;


        for(int i=0;i<arr.length-1;i++){
            int sum=arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum+=arr[j];
                if(sum==kt){
                    success=1;
                for(int k=i;k<=j;k++){
                    ans.add(arr[k]);
                }
                    break;
                }else if(sum>kt){
                    break;
                }
            }
        }

    l1: if(success==1){
            System.out.println("yes");
        }
        else{System.out.println("no");}
        System.out.println(ans);
    }
    
}
