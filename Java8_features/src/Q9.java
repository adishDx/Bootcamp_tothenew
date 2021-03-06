// Q9 Collect all the even numbers from an integer list.
import java.util.Arrays;
import java.util.function.*;
import java.util.stream.Collectors;

public class Q9 {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(1,2,3,4,5,6,7,8,9)
                .stream()
                .filter(e->e%2==0)
                .collect(Collectors.toList()));
    }
}
