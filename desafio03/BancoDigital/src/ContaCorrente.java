public class ContaCorrente extends Conta{
    //métodos
    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
        }
    
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        imprimirInfoComum();
    }
   

}
