import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.print.DocFlavor.STRING;

public class App {

    public void buscarPorId(int id){
        
        
    }
        public static void main(String[] args) throws Exception {
            //exerc01
            Produto p1 = new Produto("Notebook", 3000.00, 10.0); // com desconto
            Produto p2 = new Produto("Mouse", 150.00, null);     // sem

            p1.verificandoNulo();
            p2.verificandoNulo();

            //EXERCÍCIOS BÁSICOS
            //EXERC-01
            Optional<String> linguagem = Optional.ofNullable("Java");
            if(linguagem.isPresent()){
                System.out.println("Linguagem: " + linguagem);
            }else{
                System.out.println("Nenhum valor presente");
            }

            //EXERC-02
            Optional<String> vazio = Optional.empty();
            if(vazio.isEmpty()){
                System.out.println("Nenhum valor presente");
            }else{
                System.out.println(vazio);
            }

            //EXERC-03
            String valorNulo = null;
            String nulo = Optional.ofNullable(valorNulo).orElse("Valor padrão");
            System.out.println(nulo);

            Optional<Integer> number = Optional.ofNullable(50);
                number.ifPresent(n -> System.out.println("O número é: " + n));

            //EXERCÍCIOS INTERMEDIÁRIOS
            //EXERC-05
            Optional<String> name = Optional.ofNullable("TAYNA");
            name
                .map(n -> n.toLowerCase())
                .ifPresent(i -> System.out.println(i));
            
            //EXERC-06
            Optional<String> frameJava = Optional.ofNullable("Spring Boot");
            frameJava.filter(n -> n.contains("Boot"))
                    .ifPresentOrElse(
                        v -> System.out.println("Valor Aceito"), 
                        () -> System.out.println("Valor rejeitado"));
            
            //EXERC-07
            Double numeroVazio = null;
            Optional<Double> valorPadrao = Optional.ofNullable(numeroVazio);
                Double valorGerado = valorPadrao.orElseGet(() -> Math.random());
                System.out.println(valorGerado);
            
            //EXERC-09
            Optional<String> adm = Optional.of("Admin");
            adm
                .map(n -> n.toLowerCase())
                .filter(n -> n.equals("admin"))
                .ifPresent(i -> System.out.println(i));

            //EXERC-10
            App app = new App();
            app.buscarPorId(2);
            
            //EXERC-08
            String workNull = null;
            Optional<String> novaPalavra = Optional.ofNullable(workNull);
            novaPalavra
                .orElseThrow(() -> new IllegalArgumentException("Valor não encontrado"));

                     
            

            
                        

            

            


        

        

        
    }
}
