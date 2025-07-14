import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) throws Exception {
        AgendaEventos agenda = new AgendaEventos(null);

        agenda.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
        agenda.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agenda.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        agenda.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
        agenda.adicionarEvento(LocalDate.of(2025, 7, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

        // Exibe a agenda completa de eventos
        agenda.exibirAgenda();
        System.out.println("---------------------------");

        // Obtém e exibe o próximo evento na agenda
        agenda.obterProximoEvento();
    }
}
