import java.util.Scanner;

public class ContaBancaria {
    //atributos
    private Double saldo;
    private Double chequeEspecial;
    private Scanner scanner = new Scanner (System.in);

    //métodos
    public ContaBancaria(Double saldo) {
        this.saldo = saldo;
    }

    public void exibirMenu(){
        int opcao;
        do{
            System.out.println("\nMenu");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Consultar cheque");
            System.out.println("3. Depositar dinheiro");
            System.out.println("4. Sacar dinheiro");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> consultarSaldo();
                case 2 -> consultarCheque();
                case 3 -> depositarDinheiro();
                case 4 -> sacarDinheiro();
                case 5 -> System.out.println("Saindo....");
                default -> System.out.println("Opção inválida.");
                    
            }
        }while (opcao != 5);
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo atual é: R$ " + saldo);
    }

    public void consultarCheque(){
        if(saldo <= 500){
            chequeEspecial = 50.00;
            System.out.println("Seu cheque especial atual é: R$ " + chequeEspecial);
        }else{
            chequeEspecial = saldo/2;
            System.out.println("Seu cheque especial atual é: R$ " + chequeEspecial);
        }
    }

    public void depositarDinheiro(){
            System.out.println("Qual o valor que deseja depositar?");
            Double valorDeposito = scanner.nextDouble();
            double saldoNovo = valorDeposito + saldo;
            System.out.println("Valor depositado com sucesso!");
            System.out.printf("Seu novo saldo é: R$ " + "%.2f", saldoNovo);
    }

    public void sacarDinheiro (){
        System.out.println("Qual o valor que deseja sacar?");
        Double valorSaq = scanner.nextDouble();
        if(valorSaq > saldo){
            System.out.println("Saldo insuficiente");
        }else{
            Double saldoNovo = saldo - valorSaq;
            System.out.println("R$ " + valorSaq + " sacado com sucesso!");
            System.out.printf("Seu novo saldo é: R$ " + "%.2f", saldoNovo);
        }
    }

    public void pagarBoleto(){

    }

    

}
