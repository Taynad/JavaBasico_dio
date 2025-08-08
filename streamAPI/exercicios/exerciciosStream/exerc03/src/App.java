import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         *  1)Crie uma lista de inteiros e imprima todos os números usando um for tradicional e depois usando forEach.
            
            2)Filtre os números pares dessa lista usando um for e depois usando Stream.filter(). Imprima o resultado.

            3)Crie um Map<String, Integer> com nomes de pessoas e suas idades. Imprima todas as chaves, depois todos os valores, e finalmente todas as entradas (key + value).

            4)Adicione uma pessoa nova ao Map. Atualize a idade de uma pessoa já existente. Remova uma pessoa do Map.
         */

        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        listaNumeros.add(5);
        listaNumeros.add(6);
        listaNumeros.add(7);
        listaNumeros.add(8);
        listaNumeros.add(9);
        listaNumeros.add(10);

        System.out.println("Utilizando o for: ");
        for (int i = 1; i <= listaNumeros.size(); i++) {
            System.out.println(i);
        }
        System.out.println("Utilizando o forEach: ");
        listaNumeros.stream()
            .forEach(number -> System.out.println(number));

        List<Integer> numberPar = listaNumeros.stream()
            .filter(n -> n%2 == 0)
            .collect(Collectors.toList());
        System.out.println("Os números pares são: " + numberPar);

        Map<String, Integer> people = new HashMap<>();
        people.put("Tayna", 21);
        people.put("Kauan", 24);
        people.put("Cecilia", 14);
        people.put("Julia", 28);
        people.put("Nice", 46);
        //retornando apenas as chaves
        List<String> namePeople = people.keySet().stream()
            .collect(Collectors.toList());
        System.out.println("Retornando apenas os nomes (chave): " + namePeople);
        //retornando apenas os valores
        List<Integer> agePeople = people.values().stream()
            .sorted()
            .collect(Collectors.toList());
        System.out.println("Retornando apenas as idades (valores): " + agePeople);

        //forEACH
        people.entrySet().stream()
            .forEach(e -> System.out.println(e));
        
        //atualizando
        people.put("Julia", 26);
        System.out.println(people);
            
        
    }
}
