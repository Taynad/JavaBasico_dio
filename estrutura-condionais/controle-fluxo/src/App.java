import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double[] transacoes = new double[3];

        for(int i = 0; i < 3; i++){
            transacoes[i] = scanner.nextDouble();
        }

        double valorMinimo = scanner.nextDouble();

        int contador = 0;
        for(int i =0; i < 3; i++){
            if(transacoes[i] > valorMinimo){
                contador++;
            }
        }

        System.out.println(contador);
        scanner.close();

    }     
}
