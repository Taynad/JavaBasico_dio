public class Item {
    //atributos
    private String nome;
    private Double preco;
    private int quantidade;

    //construtor
    public Item(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //getter
    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return  nome + preco + quantidade;
    }

    
}
