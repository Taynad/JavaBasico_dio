import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         *  5)Dada uma lista de nomes, filtre aqueles que começam com a letra “A” usando Stream e imprima.

            6)Dada uma lista de inteiros, obtenha uma nova lista com o dobro de cada número (use map) e imprima.

            7)Dada uma lista de Strings, converta todas para maiúsculas e ordene alfabeticamente (use map + sorted).

            8)Dado um Map<String, Double> de produtos e preços, filtre os produtos com preço acima de 100. Imprima só os nomes dos produtos.

            9)Dado um Map<String, List<String>> de categorias de livros, liste todos os livros que começam com “O” (use flatMap).
         */

        List<String> names = new ArrayList<>();
        names.add("Tayna");
        names.add("Cecilia");
        names.add("Kauan");
        names.add("Luiza");
        names.add("Alice");
        names.add("Agatha");

        List<String> namesWithA = names.stream()
            .filter(title -> title.startsWith("A"))
            .collect(Collectors.toList());
        System.out.println("Nomes que começam com a letra A: " + namesWithA);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(2);
        numbers.add(7);
        numbers.add(45);
        numbers.add(2);

        List<Integer> doubledNumbers = numbers.stream()
            .map(n -> n *2)
            .collect(Collectors.toList());
        System.out.println("Dobro dos números da lista numbers: " + doubledNumbers);

        List<String> capitalizedNames = names.stream()
            .map(n -> n.toUpperCase())
            .sorted()
            .collect(Collectors.toList());
        System.out.println("Nomes com a letras maiúscula e ordenados: " + capitalizedNames);

        Map<String, Double> stock = new HashMap<>();
        stock.put("Arroz", 21.9);
        stock.put("Feijão", 10.0);
        stock.put("Leite", 5.99);
        stock.put("Café", 34.98);
        stock.put("Ovo", 16.00);

        List<String> nameProduct = stock.entrySet().stream()
            .filter(entry -> entry.getValue() > 20)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
        System.out.println("Produtos acima de R$20: " +nameProduct);

        Map <String, List<String>> livros = new HashMap<>();
        livros.put("Romance", new ArrayList<>());
        livros.get("Romance").add("Orgulho e Preconceito");
        livros.get("Romance").add("O Morro dos Ventos Uivantes");
        livros.get("Romance").add("A culpa é das estrelas");

        livros.put("Ação", new ArrayList<>());
        livros.get("Ação").add("Homem-Aranha");
        livros.get("Ação").add("Batman");
        livros.get("Ação").add(("O Quarteto Fantástico"));

        livros.put("Terror", new ArrayList<>());
        livros.get("Terror").add("A múmia");
        livros.get("Terror").add("Megan");
        livros.get("Terror").add("Invocação do mal");

        List<String> booksWithO = livros.values().stream()
            .flatMap(List::stream)
            .filter(title -> title.startsWith("O"))
            .collect(Collectors.toList());
        System.out.println("Livros que começam com O: " + booksWithO);


        
        
    }
}
