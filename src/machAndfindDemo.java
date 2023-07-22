import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class machAndfindDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(16,10,2,4,7,81,89,9912);
        List<Integer>sortedList= list.stream().sorted().toList();
        System.out.println("sortedList = " + sortedList);

        List<Integer>reverseSorted= list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Descending order = " + reverseSorted);

        List<Product> products= new ArrayList<Product>();
        products.add(new Product(1,"laptop hp",10000));
        products.add(new Product(1,"laptop lg",10000));
        products.add(new Product(1,"laptop samsung",10000));
        products.add(new Product(2,"router",5000));
        products.add(new Product(3,"printer",8000));
        products.add(new Product(4,"mouse",1000));
        products.stream().sorted(Comparator.comparing(Product::getName)).forEach(product
                ->System.out.println(product.name));

        // Anymach ()
      boolean result=  products.stream().anyMatch(l->{
            return l.name.startsWith("laptop");
        });
        System.out.println("AnyMatch = " + result);

        // Allmach ()
        boolean resultallmach=  products.stream().allMatch(l->{
            return l.name.startsWith("laptop");
        });
        System.out.println("Allmatch = " + resultallmach);

    }
}
