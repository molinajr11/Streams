import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,2);
        List<Integer> list2= Arrays.asList(3,4);
        List<Integer> list3= Arrays.asList(5,6);

        List<List<Integer>> list= Arrays.asList(list1,list2,list3);

        List<Integer>finalResult=list.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());

        List<String> teamA= Arrays.asList("cr7","messi","neymar");
        List<String> teamB= Arrays.asList("Ronaldiño","Bekam","Ronaldo");
        List<String> teamC= Arrays.asList("haland","mbape","belingam");

        List<List<String>> wolrdplayers= Arrays.asList(teamA,teamB,teamC);
        // sin streams
        for(List<String> team:wolrdplayers)
        {
            for(String player:team)
            {
                System.out.println(player);
            }
        }
        System.out.println("Wolrd players con streams");
        // con streams
        wolrdplayers.stream().forEach(team->team.stream().forEach(player->System.out.println(player)));

        List<Product> computadoras= new ArrayList<Product>();
        computadoras.add((new Product(1,"Laptop",1000)));
        computadoras.add((new Product(2,"Tablet",2000)));
        computadoras.add((new Product(3,"pc",1100)));

        List<Product> consolas= new ArrayList<Product>();
        consolas.add((new Product(1,"nintendo",1000)));
        consolas.add((new Product(2,"ps4",2000)));
        consolas.add((new Product(3,"xbox",1100)));

        List<List<Product>> productsList= Arrays.asList(consolas,computadoras);

        productsList.stream().
                flatMap(products -> products.stream()).
                forEach(product -> System.out.println(product.id +" "+ product.name + " " + product.price));

        productsList.stream().flatMap(products -> products.stream()).map(product -> product.name).
                forEach(System.out::println);
    }
}