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

       ArrayList<Integer> data = (ArrayList<Integer>) list.stream().filter(a->a>2).map(a->a*5).collect(Collectors.toList());
       ArrayList<Integer> even = (ArrayList<Integer>) list.stream().filter(a->a%2==0).collect(Collectors.toList());
        int sum = list.stream().reduce(0, (a,b)->a+b);
        int rum = list.stream().reduce(0, (a,b)->a>b?a:b);

        System.out.println(sum);
        System.out.println(rum);
       System.out.println(even.size());

    }
}
