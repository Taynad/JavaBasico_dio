import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe Scanner
        //TODO: exibir as mensagens para o nosso usuário
        //TODO: obter pelo Scanner os valores digitados no terminal
        //TODO: exibir a mensagem da conta criada

        //SIMULANDO A CRIAÇÃO DA CONTA
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Bem-vindo-----");
        System.out.println("Vamos começar a criação da sua conta?");
        System.out.println("Primeiro nos informe seu nome completo: ");
        String name = scanner.nextLine();
        System.out.println("ótimo " + name + " agora nos informe sua data de nascimento: ");
        String dateNasc = scanner.nextLine();
        System.out.println("Nos informe seu email: ");
        String email = scanner.nextLine();
        System.out.println("Já estamos finalizando...");
        System.out.println("Digite seu CPF usando somente números: ");
        String cpf = scanner.nextLine();

        System.out.println("Seu cadastro foi finalizado com sucesso! Mandaremos mais informações no email cadastrado " + email + " fique de olho e qualquer dúvida entre em contato conosco!");






        

    }
}
