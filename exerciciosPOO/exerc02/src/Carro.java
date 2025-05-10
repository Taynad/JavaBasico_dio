import java.util.Scanner;

public class Carro {
    //atributos
    private int marcha;
    private int velocidade;
    private boolean desligado;
    private Scanner scanner = new Scanner(System.in);

    //métodos
    public Carro(int marcha, int velocidade, boolean desligado) {
        this.marcha = 0;
        this.velocidade = 0;
        this.desligado = true;
    }

    public void ligarCarro(){
        System.out.println("Você quer ligar o carro?(Responda Sim ou Nao)");
        String resposta = scanner.nextLine().toLowerCase().trim();

        if(resposta.equals("nao")){
            desligado = true;
            System.out.println("Carro desligado");

        }else if(resposta.equals("sim")){
            desligado = false;
            System.out.println("Carro ligado");
        }else{
            System.out.println("Resposta inválida, tente novamente");
        }
    }

    public void iniciarCarro(){

        if(desligado == true){
            System.out.println("Carro desligado, não é possível inciar");
        }else if(desligado == false){
            System.out.println("Iniciando o carro");
        }else{
            System.out.println("Algo deu errado, tente novamente");
        }
    }


    public void acelerar(){

        if(desligado == false && velocidade <= 120 && marcha >= 1){
            velocidade += 1;
            System.out.println("Sua velocidade está em: " + velocidade + "Km");
        }else if(velocidade > 120){
            System.out.println("Velocidade ultrapassou 120Km");
        }else if(marcha <=0){
            System.out.println("O carro está no ponto morto");
        }
    }

    public void diminuirVelocidade(){

        if(desligado == false && velocidade >= 0){
            velocidade -= 1;
            System.out.println("Sua velocidade está em: " + velocidade + "Km");
        }else{
            System.out.println("Algo deu errado, tente novamente");
        }

    }

    public void virarEsquerdaDireita(){

        if(desligado == false && velocidade >=1 && velocidade <= 40){
            System.out.println("Qual lado quer virar o carro?(direita ou esquerda)");
            String direcao = scanner.nextLine().toLowerCase().trim();
            if(direcao.equals("direita")){
                System.out.println("Virando o carro para direita");
            }else if (direcao.equals("esquerda")){
                System.out.println("Virando o carro pra esquerda");
            }else if (velocidade > 40){
                System.out.println("Velocidade acima do permitido para fazer a direção");
            }
        }else{
            System.out.println("Algo deu errado, tente novamente");
        }
    }

    public void verificarVelocidade(){
        System.out.println("Sua velocidade está em: " + velocidade +"Km");
    }


    public void trocarMarcha(){
        if (desligado == false) {
            if(marcha == 0){
                marcha ++;
                velocidade = 20;
                System.out.println("Trocando de marcha...");
                System.out.println("Você está na primeira marcha");
            }else if(marcha == 1){
                marcha ++;
                velocidade = 40;
                System.out.println("Trocando de marcha...");
                System.out.println("Você está na segunda marcha");
            }else if(marcha == 2){
                marcha ++;
                velocidade = 60;
                System.out.println("Trocando de marcha...");
                System.out.println("Você está na terceira marcha");
            }else if(marcha == 3){
                marcha ++;
                velocidade = 80;
                System.out.println("Trocando de marcha...");
                System.out.println("Você está na quarta marcha");
            }else if(marcha == 4){
                marcha ++;
                velocidade = 100;
                System.out.println("Trocando de marcha...");
                System.out.println("Você está na quinta marcha");
            }else if(marcha == 5){
                marcha ++;
                velocidade = 120;
                System.out.println("Trocando de marcha...");
                System.out.println("Você está na sexta marcha");
            }
        }else{
            System.out.println("Algo deu errado, tente novamente");
        }
        
    }

    public void exibirMenu(){
        int opcao;
        do{
            System.out.println("\nMenu");
            System.out.println("1. Ligar carro");
            System.out.println("2. Iniciar carro");
            System.out.println("3. Acelerar carro");
            System.out.println("4. Diminuir velocidade do carro");
            System.out.println("5. Direção do carro");
            System.out.println("6. Verificar velocidade");
            System.out.println("7. Trocar marcha");
            System.out.println("8. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> ligarCarro();
                case 2 -> iniciarCarro();
                case 3 -> acelerar();
                case 4 -> diminuirVelocidade();
                case 5 -> virarEsquerdaDireita();
                case 6 -> verificarVelocidade();
                case 7 -> trocarMarcha();
                case 8 -> System.out.println("Saindo....");
                default -> System.out.println("Opção inválida.");
                    
            }
        }while (opcao != 8);
    }


}
