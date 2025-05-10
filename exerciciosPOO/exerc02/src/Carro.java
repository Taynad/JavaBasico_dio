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
        ligarCarro();

        if(desligado == true){
            System.out.println("Carro desligado, não é possível inciar");
        }else if(desligado == false){
            System.out.println("Iniciando o carro");
        }else{
            System.out.println("Algo deu errado, tente novamente");
        }
    }

    public void acelerar(){
        iniciarCarro();

        if(desligado == false && velocidade <= 120){
            velocidade += 1;
            System.out.println("Sua velocidade está em: " + velocidade + "Km");
        }else{
            System.out.println("Algo deu errado, tente novamente");
        }
    }

    public void diminuirVelocidade(){
        iniciarCarro();

        if(desligado == false && velocidade >= 0){
            velocidade -= 1;
            System.out.println("Sua velocidade está em: " + velocidade + "Km");
        }else{
            System.out.println("Algo deu errado, tente novamente");
        }

    }

    public void virarEsquerdaDireita(){
        iniciarCarro();

        if(desligado == false){
            System.out.println("Qual lado quer virar o carro?(direita ou esquerda)");
            String direcao = scanner.nextLine().toLowerCase().trim();
            if(direcao.equals("direita")){
                System.out.println("Virando o carro para direita");
            }else if (direcao.equals("esquerda")){
                System.out.println("Virando o carro pra esquerda");
            }else{
                System.out.println("Opção inválida");
            }
        }else{
            System.out.println("Algo deu errado, tente novamente");
        }
    }


    public void trocarMarcha(){
        iniciarCarro();

        if (desligado == false) {
            
        }
        
    }


}
