public class App {
    public static void main(String[] args) throws Exception {
        AgendaContatos agendaContatos = new AgendaContatos(null);

        agendaContatos.adicionarContato("Tayna", 1234455436);
        agendaContatos.adicionarContato("Tayna", 12344);
        agendaContatos.adicionarContato("Tayna Santos", 930180093);
        agendaContatos.adicionarContato("Cecilia", 44444);
        agendaContatos.adicionarContato("Tayna DIO", 1234455436);

        agendaContatos.exibirContatos();
        System.out.println("----------------------------------");

        agendaContatos.removerContato("Tayna DIO");
        agendaContatos.exibirContatos();
        System.out.println("----------------------------------");

        System.out.println(agendaContatos.pesquisarPorNome("Cecilia"));

    }
}
