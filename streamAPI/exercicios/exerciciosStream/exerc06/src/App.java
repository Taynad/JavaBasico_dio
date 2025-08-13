import java.util.Optional;

public class App {
    
        public static void main(String[] args) throws Exception {
        //Crie um Optional com o nome "Tayna" e verifique se ele está presente
        Optional<String> nome = Optional.of("Tayna");
        nome.ifPresent(System.out::println);

        //Crie um Optional vazio e use orElseThrow para lançar uma exceção IllegalArgumentException com a mensagem "Valor não encontrado"
        Optional<String> spring = Optional.of("Spring Boot");
        spring.ifPresent(valor -> System.out.println("Tecnologia " + valor));

        //Crie um Optional com o valor "Spring Boot" e use ifPresent para imprimir:"Tecnologia: Spring Boot"
        Optional<String> linguagem = Optional.of("java").map(valor -> valor.toUpperCase());
        linguagem.ifPresent(System.out::println);

        
        
        //Crie um Optional com "java" e use map para transformar em maiúsculas.
        Optional<String> excecao = Optional.empty();
        excecao.orElseThrow(() -> new IllegalArgumentException("Valor não encontrado"));


        

        

        
    }
}
