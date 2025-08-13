import java.util.Optional;

public class Produto {
    private String nome;
    private Double preco;
    private Double desconto;

    public Produto(String nome, Double preco, Double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    //método
    public void verificandoNulo(){
        Optional<Double> descontoProduto = Optional.ofNullable(desconto);
        descontoProduto
            .map(d -> preco - (preco * (d/100)))
            .orElse(preco);

        if(descontoProduto.isPresent()){
            System.out.printf("%s - Preço original: %.2f | Desconto: %.2f%% | Final: %.2f%n", nome, preco, desconto, descontoProduto.get());
        }else{
            System.out.printf("%s - Preço: %.2f (sem desconto)%n", nome, preco);
        }
    }

}
