public class Conta implements IConta {
    //atributos
    protected static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL =1;
    protected int agencia;
    protected int numeroConta;
    protected  double saldo;
    protected Cliente cliente;
    protected Banco banco;

    //métodos
    public Conta(Cliente cliente, Banco banco){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;
    }
    public int getAgencia() {
        return agencia;
    }
 
    public int getNumeroConta() {
         return numeroConta;
    }
 
    public double getSaldo() {
         return saldo;
    }

    @Override
    public void sacar(double valor) {
        if(valor >= saldo){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Não foi possível realizar o saque!");
        }
        
    }   

    @Override
    public void depositar(double valor) {
        if(valor > 0){
            saldo += valor;
            System.out.println("Deposito realizado com sucesso!");
        }else{
            System.out.println("Não foi possível realizar o deposito!");
        }
        
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(valor >= saldo){
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência realizado com sucesso para: " + contaDestino);
        }else{
            System.out.println("Não foi possível realizar a transferência para: " + contaDestino);
        }

    }
    
    protected void imprimirInfoComum() {
        System.out.println(String.format("Banco: %s", this.banco.getNome()));
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    @Override
    public void imprimirExtrato() {
        
    }
 


}
