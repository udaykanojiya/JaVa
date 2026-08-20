import java.util.*;


class Freq_Count_Hash {
    public static void main(String[] args) {

        int[] arr = {2, 3, 2, 4, 3, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        System.out.println(map);

         String str = "banana";

        HashMap<Character, Integer> s = new HashMap<>();

        for (char ch : str.toCharArray()) {
            s.put(ch, s.getOrDefault(ch, 0) + 1);
        }

        System.out.println(s);
    }
}