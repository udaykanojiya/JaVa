import java.util.ArrayList;


public class prac3{
    public static void main(String[] args) {
        int[] arr= {16,17,4,3,5,2};
        // int[] ans = new int[arr.length];

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            int val=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    val=0;
                    break;
                }

            }
            if(val==1){
                ans.add(arr[i]);
            }
        }

        System.out.println(ans);
    
    }
}