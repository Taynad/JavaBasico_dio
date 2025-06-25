public class App {
    public static void main(String[] args) throws Exception {
        SomaNumeros somaNumeros = new SomaNumeros(null);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(2);
        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros.exibirNumeros());
    }
}
