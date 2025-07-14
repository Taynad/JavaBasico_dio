public class App {
    public static void main(String[] args) throws Exception {
        ContagemPalavras contagem = new ContagemPalavras(null);

        contagem.exibirContagemPalavras();
        System.out.println("------------------------");

        contagem.adicionarPalavra("tem", 15);
        contagem.adicionarPalavra("Havia", 33);
        contagem.adicionarPalavra("Hoje", 14);
        contagem.adicionarPalavra("Agora", 8);
        contagem.exibirContagemPalavras();
        System.out.println("------------------------");

        contagem.removerPalavra("Agora");
        contagem.exibirContagemPalavras();
        System.out.println("------------------------");

        System.out.println(contagem.encontrarPalavrasMaisFrequente());
        
    }
}
