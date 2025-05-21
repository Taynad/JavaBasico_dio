public class App {
    public static void main(String[] args) throws Exception {
        Saudacao s = (nome) -> System.out.println("Olá " + nome);

        s.dizerOla("Tayna");

        Quadrado q = (numero) -> System.out.println(numero*numero);

        q.calcular(4);

        Chamada c = () -> System.out.println("Seja bem-vinda Tayna");

        c.mostrar();
           
}
}
