import java.util.*;
import java.util.stream.Collectors;

public class EvenSquares {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = input.stream()
                                    .filter(n -> n % 2 == 0)       // keep only even numbers
                                    .map(n -> n * n)               // square them
                                    .collect(Collectors.toList()); // collect as list

        System.out.println(result);  // Output: [4, 16]
    }
}
