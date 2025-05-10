public class Atendente extends Funcionario{
    
    //atributo
    private int valorCaixa;

    //construtor
    public Atendente(String nome, String email, String senha, Boolean adm) {
        super(nome, email, senha, adm = false);
}

    //método próprio da classe
    public void receberPagamento(){
        System.out.println("Recebendo pagamento");
        valorCaixa++;
    }

    public void fecharCaixa(){
        System.out.println("Fechando caixa");
    }

    //metodos pegados da classe pai funcionario
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
