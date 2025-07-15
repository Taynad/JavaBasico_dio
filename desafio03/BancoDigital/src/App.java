public class App {
    public static void main(String[] args) throws Exception {
        Cliente Tayna = new Cliente();
        Tayna.setNome("Tayna");

        Banco caixa = new Banco();
        caixa.setNome("Caixa");

        Conta cc = new ContaCorrente(Tayna, caixa);
        Conta cp = new ContaPoupanca(Tayna, caixa);
        
        System.out.println("--------------------------");
        cc.depositar(100);
        cc.transferir(100, cp);
        System.out.println("--------------------------");

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
