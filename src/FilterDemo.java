import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {
        List<Integer>listnumbers= new ArrayList<Integer>();
        List<Integer>evenNumbers;
        for(int i=1; i<18; i++) {
            listnumbers.add(i);
        }
        // aplicando filter que es un predicate y guardando en otra lista el resultado
        evenNumbers=listnumbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNumbers);
        //aplicnado filter e imprimiendo el resultado con action de consumer(I)
        listnumbers.stream().filter(n->n%2==0).forEach(System.out::println);
        System.out.println("Evaluando varias condiciones en el predicado");
        //Evaluando varias condiciones en el predicado
        List<String> longNames= Arrays.asList("Esteban","Magdalna","nubia");
        longNames.stream().filter(s->s.length()>3 && s.length()<8).forEach(System.out::println);
        System.out.println("filtrando valores nulos");
        //filtrando valores nulos
        List<String> words= Arrays.asList("Esteban",null,"Magdalna",null,"nubia",null,"Luis");
        words.stream().filter(w->w!=null).forEach(System.out::println);
        // filtrando objetos
        List<Product> products= new ArrayList<Product>();
        products.add(new Product(1,"ps4",12000));
        products.add(new Product(2,"xboX",15000));
        products.add(new Product(3,"ps3",10000));
        products.add(new Product(4,"laptopLenovo",12000));
        products.stream().filter(product ->product.price<20000).forEach(product -> System.out.println(product.name));}
}
