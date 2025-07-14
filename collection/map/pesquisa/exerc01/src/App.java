public class App {
    public static void main(String[] args) throws Exception {
        EstoqueProdutos estoque = new EstoqueProdutos(null);

        // Exibe o estoque vazio
        estoque.exibirProdutos();
        System.out.println("------------------------------------");
    
        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);
        estoque.exibirProdutos();
        System.out.println("------------------------------------");

        System.out.println(estoque.calcularValorTotalEstoque());
        System.out.println("------------------------------------");

        System.out.println( estoque.obterProdutoMaisCaro());
        System.out.println("------------------------------------");

        System.out.println(estoque.obterProdutoMaisBarato());
        System.out.println("------------------------------------");

        System.out.println(estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    
        
    }
}
