import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class prac5 {
    public static void main(String[] args){
        int[] arr = {1,5,7,-1,5};

        // HashMap<Integer,Integer> ans = new HashMap<>();
        // ArrayList<Integer> ans = new ArrayList<>();
        // Set<String,String> ans= new HashSet<>();
        List<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])==k){
                    // System.out.println(i+" "+j);
                    // ans.put(arr[i],arr[j]);
                    Collections.addAll(list, arr[i],arr[j]);
                    // break;
                }
            }
        }
        sc.close();
        System.out.println(list);
    }
}
