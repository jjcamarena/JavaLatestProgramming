import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ImperativeVsDeclarative {
    public static void main(String[] args) {

        // Ex 1
        int sum = IntStream.of(1,2,3,4,5).sum();
        System.out.println("Sum = " + sum);

        //Ex 2
        int suma = IntStream.range(1,5).sum();
        System.out.println("Sum = " + suma);

        //Ex 2.1
        suma = IntStream.rangeClosed(1,5).sum();
        System.out.println("Sum = " + suma);

        // Ex 3 Imperative style
        List<Integer> numbers = Arrays.asList(8,7,6,5,4,3,2,1);
        int min = numbers.get(0);
        System.out.println("Size: " + numbers.size());
        System.out.println("min = " + min);
        for (Integer number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("min = " + min);

        // Ex 3 Declarative style
        List<Integer> numb3rs = Arrays.asList(1,22,3,4,5,6,7,8);
        System.out.println(numb3rs.stream().min(Integer::compareTo));

    }
}
