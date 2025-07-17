import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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
        System.out.println("----EXERC 7----");
        Optional<Integer> segundoMaior = numeros.stream()
                .distinct() // remove duplicados
                .sorted((a, b) -> b.compareTo(a)) // ordena decrescente
                .skip(1) // pula o maior
                .findFirst(); // pega o próximo (segundo maior)

        if (segundoMaior.isPresent()) {
            System.out.println("O segundo maior número é: " + segundoMaior.get());
        } else {
            System.out.println("Não existe segundo maior número na lista.");
        }

        /*
         * Somar os dígitos de todos os números da lista
         */
        System.out.println("----EXERC 8----");
        int somaLista = numeros.stream()
            .reduce(0, Integer::sum);
        System.out.println(somaLista);

        /*
         * Verificar se todos os números da lista são distintos (não se repetem)
         */
        System.out.println("----EXERC 9----");
        boolean numerosRepetem = numeros.stream()
            .allMatch(n -> n == n);
        System.out.println(numerosRepetem);

        /*
         * Agrupe os valores ímpares múltiplos de 3 ou de 5
         */
        System.out.println("----EXERC 10----");
        List<Integer> multiplos = numeros.stream()
            .filter(n -> n % 3 == 0 || n % 5 == 0)
            .collect(Collectors.toList());
        System.out.println(multiplos);

        /*
         * Encontre a soma dos quadrados de todos os números da lista
         */
        System.out.println("----EXERC 11----");
        List<Integer> somaQuadrados = numeros.stream()
            .map(n -> n * n)
            .collect(Collectors.toList());
        System.out.println(somaQuadrados);

        /*
         * Encontre o produto de todos os números da lista
         */
        System.out.println("----EXERC 12----");
        int produtoLista = numeros.stream()
            .reduce(1, (a, b) -> a * b);
        System.out.println(produtoLista);
        /*
         * Filtrar os números que estão dentro de um intervalo
         */
        System.out.println("----EXERC 13----");
        List<Integer> intervaloLista = numeros.stream()
            .filter(n -> n > 5 && n < 10)
            .collect(Collectors.toList());
        System.out.println(intervaloLista);


        
        
    }
}
