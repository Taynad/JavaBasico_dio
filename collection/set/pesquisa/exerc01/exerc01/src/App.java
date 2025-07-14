public class App {
    public static void main(String[] args) throws Exception {
        AgendaContatos agendaContatos = new AgendaContatos(null);

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Tayna", 123456);
        agendaContatos.adicionarContato("Tayna", 0);
        agendaContatos.adicionarContato("Tayna Santos", 111111);
        agendaContatos.adicionarContato("Tayna DIO", 678910);
        agendaContatos.adicionarContato("Iasmin Cecilia", 111111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Tayna"));

        System.out.println("Contato atualizado: " +agendaContatos.atualizarNumeroContato("Iasmin Cecilia", 5555555));

    }
}
