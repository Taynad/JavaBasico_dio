import java.util.Scanner;

public abstract class Funcionario {
    //atributos
    private String nome;
    private String email;
    private String senha;
    private Boolean adm;
    private Scanner scanner = new Scanner(System.in);

    //construtor
    public Funcionario(String nome, String email, String senha, Boolean adm) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.adm = adm;
    }

    //métodos
    public void consultarVendas(){
        System.out.println("Consultando vendas");
    }

    public void realizarLogin(){
        System.out.println("Informe seu email: ");
        String emailEntrada = scanner.nextLine().toLowerCase().trim();
        System.out.println("Informe sua senha: ");
        String senhaEntrada = scanner.nextLine().toLowerCase().trim();

        if(emailEntrada.equals(email) && senhaEntrada.equals(senha)){
            System.out.println("Login realizado com sucesso!");
        }else{
            System.out.println("Email ou senha inválidos!");
        }
    }


    public  void realizarLogff(){
        System.out.println("Saindo..");

    }

    public  void alterarDados(){
        System.out.println("Seus dados atuais: ");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);
        System.out.println("Qual dado deseja alterar? ");
        String dadoAlteracao = scanner.nextLine().toLowerCase().trim();
        if(dadoAlteracao.equals("nome")){
            System.out.println("Digite o nome para alteração: ");
            nome = scanner.nextLine();
            System.out.println("Nome alterado com sucesso para: " + nome);
        }else if(dadoAlteracao.equals("email")){
            System.out.println("Digite seu novo email: ");
            email = scanner.nextLine();
            System.out.println("Email alterado com sucesso para: " + email);
        }else if(dadoAlteracao.equals("senha")){
            System.out.println("Digite sua nova senha: ");
            senha = scanner.nextLine();
            System.out.println("Senha alterado com sucesso para: " + senha);
        }else{
            System.out.println("opção inválida, tente novamente!");
        }


    }

    public  void alterarSenha(){
        System.out.println("Digite sua nova senha: ");
        senha = scanner.nextLine();
        System.out.println("Senha alterada com sucesso para: " + senha);

    }

}
