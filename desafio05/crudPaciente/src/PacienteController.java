import java.util.Scanner;

public class PacienteController {
   private  Scanner scanner = new Scanner(System.in);
   private int opcao;
   private PacienteService pacienteService = new PacienteService();;


   public void menu () {
    while(opcao != 5){
        System.out.println("\nMenu:");
        System.out.println("1 - Cadastrar paciente");
        System.out.println("2 - Listar pacientes");
        System.out.println("3 - Atualizar consulta do paciente");
        System.out.println("4 - Deletar paciente");
        System.out.print("5 - Sair: ");
        System.out.println("Escolha uma opção");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Digite o nome do paciente: ");
                String nome = scanner.nextLine();

                System.out.println("Digite o cpf do paciente: ");
                String cpf = scanner.nextLine();

                System.out.println("Digite a consulta do paciente: ");
                String consulta = scanner.nextLine();

                PacienteModel paciente = new PacienteModel(nome, cpf, consulta);
                pacienteService.createPaciente(paciente);
                break;
            
            case 2:
                System.out.println("--- Listando pacientes ---");
                System.out.println(pacienteService.readPaciente());
                break;

            case 3: 
                System.out.println("--- Atualizando consulta do paciente ---");
                System.out.println("Informe o cpf do paciente: ");
                String cpfAtualizacao = scanner.nextLine();
                System.out.println("Qual a nova consulta?: ");
                String consultaAtualizada = scanner.nextLine();

                pacienteService.updateConsulta(cpfAtualizacao, consultaAtualizada);
                break;
            
            case 4:
                System.out.println("--- Deletando paciente ---");
                System.out.println("Qual o cpf paciente quer deletar?: ");
                String pacienteDeletado = scanner.nextLine();

                pacienteService.deletePaciente(pacienteDeletado);
                break;
            
            case 5:
                System.out.println("Saindo...");
            
            default:
            System.out.println("Opção inválida tente novamente");
                break;
        }
   }

}

}
