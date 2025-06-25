public class Numeros {
    private int Numero;

    public Numeros(int numero) {
        Numero = numero;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    @Override
    public String toString() {
        return "Numeros [Numero=" + Numero + "]";
    }

    

}
