import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /*
         *  Mostre a lista na ordem numérica:
         */
        System.out.println("----EXERC 1----");
        List<Integer> ordenados = numeros.stream()
            .sorted()
            .collect(Collectors.toList());
        
            System.out.println(ordenados);

        /*
         *  Imprima a soma dos números pares da lista:
         */
        System.out.println("----EXERC 2----");
        int somaPares = numeros.stream()
            .filter(n -> n % 2 == 0)
            .reduce(0, Integer::sum);

        System.out.println(somaPares);

        /*
         *  Verifique se todos os números da lista são positivos:
         */
        System.out.println("----EXERC 3----");
        boolean positivos = numeros.stream()
            .allMatch(n -> n > 0);
        System.out.println(positivos);
        /*
         * Remova todos os valores ímpares
         */
        System.out.println("----EXERC 4----");
        List<Integer> pares = numeros.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());
        System.out.println(pares);

        /*
         * Calcule a média dos números maiores que 5:
         */
        System.out.println("----EXERC 5----");
        int somaNumeros = numeros.stream()
            .filter(n -> n > 5)
            .reduce(0, Integer::sum);
        System.out.println(somaNumeros);

        /*
         * Verificar se a lista contém algum número maior que 10:
         */
        System.out.println("----EXERC 6----");
        boolean numerosMaiorDez = numeros.stream()
            .allMatch(n -> n > 10);
        System.out.println(numerosMaiorDez);

        /*
         * Encontrar o segundo número maior da lista
         */
        


        
        
    }
}
