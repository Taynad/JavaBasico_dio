public class App {
    public static void main(String[] args) throws Exception {
        SmartTv SmartTv = new SmartTv();

        System.out.println("TV ligada ? " + SmartTv.ligada);
        System.out.println("Canal atual: " +SmartTv.canal);
        System.out.println("Volume atual: " +SmartTv.volume);
    }
}
