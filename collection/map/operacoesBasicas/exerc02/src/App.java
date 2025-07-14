public class App {
    public static void main(String[] args) throws Exception {
        Dicionario dicionario = new Dicionario(null);

        dicionario.exibirPalavras();
        System.out.println("---------------------------");

        dicionario.adicionarPalavra("Amor", "Amar alguém");
        dicionario.adicionarPalavra("Saudade", "Sentir falta da presença de alguém");
        dicionario.adicionarPalavra("Chique", "Algo elegante");
        dicionario.adicionarPalavra("Estudar", "Aprender algo novo ou aperfeiçoar em algo ");
        dicionario.exibirPalavras();
        System.out.println("---------------------------");

        dicionario.removerPalavra("Amor");
        dicionario.exibirPalavras();
        System.out.println("---------------------------");

        System.out.println(dicionario.pesquisarPorPalavra("Saudade"));
    }
}
