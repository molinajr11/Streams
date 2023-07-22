import java.util.ArrayList;
import java.util.List;

public class ParallelStreamsDemo {
    public static void main(String[] args) {
        List<Product> products= new ArrayList<Product>();
        products.add(new Product(2,"router",5000));
        products.add(new Product(3,"printer",8000));
        products.add(new Product(4,"mouse",1000));
        products.add(new Product(5,"monitor",2000));
        products.parallelStream().filter(product ->product.price<3000).limit(5)
                .forEach(product -> System.out.println(product.name +" Price:"+ product.price));
    }
}
