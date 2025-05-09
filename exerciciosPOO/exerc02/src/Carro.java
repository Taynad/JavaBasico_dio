public class Carro {
    //atributos
    private int marcha;
    private int velocidade;
    private boolean desligado;

    //métodos
    public Carro(int marcha, int velocidade, boolean desligado) {
        this.marcha = 0;
        this.velocidade = 0;
        this.desligado = true;
    }

    public void ligarCarro(){
        if(desligado == true){
            System.out.println("Carro desligado");
        }else{
            System.out.println("Carro ligado");
        }
    }

    public void iniciarCarro(){
        
    }

}
