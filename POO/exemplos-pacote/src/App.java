import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       int valorA = scanner.nextInt();
       int valorB = scanner.nextInt();
       int valorC = scanner.nextInt();

       if( valorA > valorB && valorA > valorC ){
            System.out.println(valorA + " eh o maior");
       }else if (valorB > valorA && valorB > valorC){
            System.out.println(valorB + " eh o maior");
       }else{
            System.out.println(valorC + " eh o maior");
       }

       scanner.close();


       
    }
}
