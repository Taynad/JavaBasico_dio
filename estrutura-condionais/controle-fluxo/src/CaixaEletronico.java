public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolictado = 17.0;

        //condiocional simples
        if(valorSolictado < saldo)
            saldo = saldo - valorSolictado;
            System.out.println(saldo);
    }
    
}
