public class App {
    public static void main(String[] args) throws Exception {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos(null);

        gerenciadorAlunos.exibirAlunos();
        System.out.println("--------------------------");

        gerenciadorAlunos.adicionarAluno("Tayna", 1234456L, 9.5);
        gerenciadorAlunos.adicionarAluno("Cecilia", 1237656L, 9.0);
        gerenciadorAlunos.adicionarAluno("Claúdio", 1230956L, 7.5);
        gerenciadorAlunos.adicionarAluno("Júlio", 1233356L, 6.5);

        gerenciadorAlunos.exibirAlunos();
        System.out.println("--------------------------");

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println("--------------------------");

        gerenciadorAlunos.removerAluno(1230956);
        gerenciadorAlunos.exibirAlunos();
        System.out.println("--------------------------");

        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());




    }
}
