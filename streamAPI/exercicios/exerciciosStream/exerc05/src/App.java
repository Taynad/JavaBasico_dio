import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         *  10) Dada uma lista de números, calcule a soma de todos os números pares usando filter + reduce ou sum().

            11) Calcule a média de uma lista de valores Double usando Stream.

            12) Dado um Map<String, Integer> de meses e vendas, encontre o mês com a maior venda (use max com Map.Entry.comparingByValue()).

            13) Dado um Map<String, List<Double>> com categorias e listas de valores, calcule a soma total dos valores de todas as categorias (use flatMap + mapToDouble + sum).
         */

         List<Integer> numbers = new ArrayList<>();

         numbers.add(10);
         numbers.add(5);
         numbers.add(7);
         numbers.add(8);
         numbers.add(3);
         numbers.add(4);

         Integer sumNumber = numbers.stream()
            .filter(n -> n%2 == 0)
            .reduce(0, Integer::sum);
        System.out.println("A soma dos números pares é: " + sumNumber);

        List<Double> listTwoNumbers = new ArrayList<>();

        listTwoNumbers.add(21.99);
        listTwoNumbers.add(4.00);
        listTwoNumbers.add(32.76);
        listTwoNumbers.add(22.90);
        listTwoNumbers.add(14.32);

        double mediaNumbers = listTwoNumbers.stream()
            .mapToDouble(Double::doubleValue) //precisa converter porque não existe o método average em Stream<Double> então precisamos converter em DoubleStream
            .average()
            .orElse(0.0);
        System.out.println("A média dos números é: " + mediaNumbers);

        Map<String, Integer> messesVendas = new HashMap<>();
        messesVendas.put("Janeiro", 18000);
        messesVendas.put("Fevereiro", 17890);
        messesVendas.put("Março", 20764);
        messesVendas.put("Abril", 21345);
        messesVendas.put("Maio", 24512);

        Map.Entry<String, Integer> mesComMaisVendas = messesVendas.entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .orElse(null);
        
        System.out.println("O mês com maior venda foi: " + mesComMaisVendas);

        Map<String, List<Double>> produtosFornecedores= new HashMap<>();
        produtosFornecedores.put("Arroz", new ArrayList<>());
        produtosFornecedores.get("Arroz").add(21.99);
        produtosFornecedores.get("Arroz").add(19.00);
        produtosFornecedores.get("Arroz").add(18.98);

        produtosFornecedores.put("Feijão", new ArrayList<>());
        produtosFornecedores.get("Feijão").add(12.00);
        produtosFornecedores.get("Feijão").add(16.00);
        produtosFornecedores.get("Feijão").add(18.00);
        produtosFornecedores.get("Feijão").add(14.00);

        double somaTotal = produtosFornecedores.values().stream()
            .flatMap(List::stream)
            .mapToDouble(Double::doubleValue)
            .sum();
        System.out.println("O total é: " + somaTotal);

        
        

            
        
         
    }
}
