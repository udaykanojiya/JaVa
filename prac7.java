import java.util.ArrayList;

public class prac7 {
    public static void main(String[] args) {
        int[] arr ={1,2,4,6,7,8,10};

        ArrayList<Integer> ans = new ArrayList<>();
        
         
        for(int i=0;i<arr.length-1;i++){
            if((arr[i+1]-arr[i])!=1){
                ans.add(arr[i]+1);
            }
        }

        System.out.println(ans);
    }
}

