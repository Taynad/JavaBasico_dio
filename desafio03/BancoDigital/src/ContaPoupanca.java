public class ContaPoupanca extends Conta{
    //métodos
    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
            
    }
    
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        imprimirInfoComum();
    }
    
    


}
