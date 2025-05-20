import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        int option;
        GeometricForm geometricForm = null;
        while (true) {
            System.out.println("Escolha a forma geométrica para calcular");
            System.out.println("1. Quadrado");
            System.out.println("2. Retângulo");
            System.out.println("3. Circulo");
            System.out.println("4. Sair");
            System.out.println("Qual você quer calcular?: ");
            option = scanner.nextInt();
            if( option == 1){
                geometricForm = createSquare();
            }else if ( option == 2){
                geometricForm = createRectangle();
            } else if (option ==3){
                geometricForm = createCircle();
            }else if (option == 4){
                break;
            }else{
                System.out.println("Opção inválida");
                continue;
            }
            System.out.println("O resultado do cálculo da área foi de: " + geometricForm.getArea());
            
        }
    }

    private static GeometricForm createSquare(){
        System.out.println("Informe os tamanho dos lados: ");
        var side = scanner.nextDouble();
        return new Square(side);
    }

    private static GeometricForm createRectangle(){
        System.out.println("Informe a base: ");
        var base = scanner.nextDouble();
        System.out.println("Informe a altura: ");
        var heigth = scanner.nextDouble();
        return new Rectangle(heigth, base);
    }

    private static GeometricForm createCircle(){
        System.out.println("Informe o raio: ");
        var radius = scanner.nextDouble();
        return new Circle (radius);
    }
}


