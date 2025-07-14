public class App {
    public static void main(String[] args) throws Exception {
        ListaTarefas listaTarefas = new ListaTarefas(null);

        listaTarefas.exibirTarefas();
        System.out.println("------------------------------------");

        listaTarefas.adicionarTarefa("Estudar POO");
        listaTarefas.adicionarTarefa("Estudar chatBot");
        listaTarefas.adicionarTarefa("Estudar SpringBoot");
        listaTarefas.adicionarTarefa("Limpar a casa");

        listaTarefas.exibirTarefas();

        System.out.println("------------------------------------");


        listaTarefas.removerTarefa("Estudar POO");

        listaTarefas.exibirTarefas();
        System.out.println("------------------------------------");


        listaTarefas.contarTarefas();
        System.out.println("------------------------------------");

        listaTarefas.obterTarefasPendentes();
        System.out.println("------------------------------------");

        listaTarefas.marcarTarefaConcluida("Limpar a casa");
        listaTarefas.obterTarefasConcluidas();
        System.out.println("------------------------------------");

        listaTarefas.marcarTarefaPendente("Limpar a casa");
        System.out.println("------------------------------------");

        listaTarefas.obterTarefasPendentes();
        System.out.println("------------------------------------");

        listaTarefas.limparListaTarefas();








    }
}
