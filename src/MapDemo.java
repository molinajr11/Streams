import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class MapDemo {
    public static void main(String[] args) {
        System.out.println("Tamaño de string");
        List<String> vehicles= Arrays.asList("bus","car","bicycle","flight","airplane");
        vehicles.stream().map(String::length).forEach(System.out::println);
        System.out.println("multiplo numeros");
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9);
        numbers.stream().map(i->i*2).forEach(System.out::println);
        System.out.println("trabajando con objetos");
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1,"carro",1000));
        products.add(new Product(2,"bicicleta",2000));
        products.add(new Product(3,"avion",3000));
        products.add(new Product(4,"moto",4000));

        products.stream().filter(p->p.price>1500).map(p->p.price).collect(Collectors.toList());



    }
}
