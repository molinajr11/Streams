import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OperationalStreams {
    public static void main(String[] args) {
        List<String> vehicles= Arrays.asList("bus","train","car","plane","train","bus");
        vehicles.stream().distinct().forEach(System.out::println);
        long size= vehicles.stream().distinct().count();
        System.out.println("size = " + size);

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // min
      Optional<Integer> min=  numbers.stream().min((num1, num2)->{
            return num1.compareTo(num2);
        });
      System.out.println("min = " + min.get());
      // max
        Optional<Integer> max=  numbers.stream().max(Integer::compareTo);
        System.out.println("max = " + max.get());

    }
}
