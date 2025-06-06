import java.util.ArrayList;
import java.util.stream.*;

public class stream {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(4);
       list.add(6);
       list.add(9);
       list.add(2);

       ArrayList<Integer> data = (ArrayList<Integer>) list.stream().map(a->a*5).collect(Collectors.toList());
       System.out.println(data);

    }
}
