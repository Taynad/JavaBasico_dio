import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 1) Cadastro de Livros por Categoria (Map + List + Stream)
            Crie uma estrutura que armazene livros organizados por categoria:
            Use um Map<String, List<String>>, onde a chave é a categoria (ex: "Ficção") e o valor é a lista de livros.
            Adicione pelo menos 3 categorias e 3 livros por categoria.
            Exiba todos os livros da categoria "Fantasia".
            Liste todas as categorias ordenadas por nome.
            Liste todos os livros (de todas as categorias) que começam com a letra "O".
         */

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

        List <String> livroAcao = livros.entrySet().stream()
            .filter(entry -> entry.getKey().equalsIgnoreCase("Ação"))
            .flatMap(entry -> entry.getValue().stream())
            .collect(Collectors.toList());

        System.out.println("Livros de ação: " + livroAcao);

        List<String> ordenadosNome = livros.keySet().stream()
            .sorted()
            .collect(Collectors.toList());
        
        System.out.println("Livros ordenados por nome da categoria: " + ordenadosNome);

        List<String> livrosComecamComO = livros.values().stream()
            .flatMap(List::stream)
            .filter(titulo -> titulo.startsWith("O"))
            .collect(Collectors.toList());
        
        System.out.println("Livros que começam com a letra O: " + livrosComecamComO);

        
    }
}
