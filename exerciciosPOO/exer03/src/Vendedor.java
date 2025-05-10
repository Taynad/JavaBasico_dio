public class Vendedor extends Funcionario {
    //atributos
    private int quantidadeVendas;

    //construtor
    public Vendedor(String nome, String email, String senha, Boolean adm) {
        super(nome, email, senha, adm = false);
}

    //método próprio da classe
    public void realizarVenda(){
        System.out.println("Realizando venda");
        quantidadeVendas++;
    }

    //metodos pegados da classe pai funcionario
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



    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }



    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    

}
