import java.util.HashMap;

public class prac8 {
    public static void main(String[] args) {
        
        int[] arr = {1,2,2,3,4,5,5,6,7,8,8,8,9,9};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        map.entrySet().removeIf(entry->entry.getValue()==1);
        System.out.println(map);
    }
}
