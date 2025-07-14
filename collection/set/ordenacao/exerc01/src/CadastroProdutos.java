import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributo
    private Set<Produto> produtoSet;

    //métodos
    public CadastroProdutos(Set<Produto> produtoSet) {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet); //deixa organizado TreeSet
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        if (!produtoSet.isEmpty()) {
          produtosPorPreco.addAll(produtoSet);
          return produtosPorPreco;
        } else {
          throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void exibirTodosProdutos(){
        System.out.println(produtoSet);
    }

    

    

}
