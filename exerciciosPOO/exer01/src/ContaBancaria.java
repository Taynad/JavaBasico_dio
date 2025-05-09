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
            System.out.println("5. Pagar boleto");
            System.out.println("6. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> consultarSaldo();
                case 2 -> consultarCheque();
                case 3 -> depositarDinheiro();
                case 4 -> sacarDinheiro();
                case 5 -> pagarBoleto();
                case 6 -> System.out.println("Saindo....");
                default -> System.out.println("Opção inválida.");
                    
            }
        }while (opcao != 6);
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
            saldo += valorDeposito;
            System.out.println("Valor depositado com sucesso!");
            System.out.printf("Seu novo saldo é: R$ " + "%.2f", saldo);
    }

    public void sacarDinheiro (){
        System.out.println("Qual o valor que deseja sacar?");
        Double valorSaq = scanner.nextDouble();
        if(valorSaq > saldo){
            System.out.println("Saldo insuficiente");
        }else{
            saldo -= valorSaq;
            System.out.println("R$ " + valorSaq + " sacado com sucesso!");
            System.out.printf("Seu novo saldo é: R$ " + "%.2f", saldo);
        }
    }

    public void pagarBoleto(){
        consultarCheque();

        System.out.println("Que realizar esse pagamento com o cheque especial ou saldo da conta? ");
        String pagamento = scanner.nextLine().toLowerCase().trim();

        System.out.println("Qual o valor do boleto que deseja pagar: R$ ");
        Double valorBoleto = scanner.nextDouble();


        if(pagamento.equals("cheque especial") && valorBoleto <= chequeEspecial){
            chequeEspecial -= valorBoleto;
            Double taxa = (valorBoleto*20)/100;

            System.out.println("Boleto pago com sucesso!");
            System.out.printf("Seu cheque especial atual é: R$ %.2f\n", chequeEspecial);
            System.out.printf("A taxa cobrada será de: R$ %.2f\n", taxa);

        }else if (pagamento.equals("saldo") && valorBoleto <= saldo){
            saldo -= valorBoleto;
            System.out.println("Boleto pago com sucesso!");
            System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
        }else {
            System.out.println("Forma de pagamento inválida ou saldo insuficiente.");
        }
        
    }

    

}
