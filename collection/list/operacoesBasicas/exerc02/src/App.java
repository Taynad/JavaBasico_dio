public class App {
    public static void main(String[] args) throws Exception {
        // Criando carrinho
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Teste 1: Adicionar itens
        System.out.println("Teste 1: Adicionando itens...");
        carrinho.adicionarItem("Maçã", 2.5, 4);
        carrinho.adicionarItem("Pão", 1.0, 6);   
        carrinho.adicionarItem("Leite", 4.5, 2); 
        carrinho.exibirItens(); 

        // Teste 2: Calcular valor total
        System.out.println("\nTeste 2: Calculando valor total...");
        Double total = carrinho.calcularValorTotal();
        System.out.println("Valor total calculado: R$" + total);

        // Teste 3: Remover item
        System.out.println("\nTeste 3: Removendo item 'Pão'...");
        carrinho.removerItem("Pão");
        carrinho.exibirItens(); 

        // Teste 4: Verificar valor total após remoção
        System.out.println("\nTeste 4: Valor total após remoção...");
        total = carrinho.calcularValorTotal();
        System.out.println("Valor total calculado: R$" + total);

        
    }
}
