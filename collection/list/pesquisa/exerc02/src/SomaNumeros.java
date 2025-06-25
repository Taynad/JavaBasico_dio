import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Numeros> listNumeros;

    public SomaNumeros(List<Numeros> listNumeros) {
        this.listNumeros = new ArrayList<>();
    }

    //métodos
    public void adicionarNumero(int numero){
        listNumeros.add(new Numeros(numero));
    }

    public int calcularSoma(){
        int soma = 0;
        for(Numeros n : listNumeros){
            int numeros = n.getNumero();
            soma += numeros;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        for(Numeros n : listNumeros){
            if(n.getNumero() > maior){
                maior = n.getNumero();
                break;
               
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        for(Numeros n : listNumeros){
            if(n.getNumero() < menor){
                menor = n.getNumero();
            }
        }
        return menor;
    }

    public List<Numeros> exibirNumeros(){
        return listNumeros;
    }




}
