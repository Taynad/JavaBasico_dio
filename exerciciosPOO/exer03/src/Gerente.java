public class Gerente extends Funcionario {

    public void gerarRelatorio(){
        System.out.println("Gerando relatório...");
    }

    //construtor
    public Gerente(String nome, String email, String senha, Boolean adm) {
        super(nome, email, senha, adm = true);
}

    //métodos pegados da classe pai funcionario
    @Override
    public void consultarVendas() {
        super.consultarVendas();
    }
    
    @Override
    public void alterarDados() {
        super.alterarDados();
    }

    @Override
    public void alterarSenha() {
        super.alterarSenha();
    }

    @Override
    public void realizarLogff() {
        super.realizarLogff();
    }

    @Override
    public void realizarLogin() {
        super.realizarLogin();
    }

    
    

    


}
