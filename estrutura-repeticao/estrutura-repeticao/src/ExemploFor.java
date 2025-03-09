public class ExemploFor {

    public static void main(String[] args) {
        for(int carneirinhos =1; carneirinhos <=5; carneirinhos++){
            System.out.println("Contando carneirinhos: " + carneirinhos);
        }

        //for em arrays
        String alunos[] = {"FELIPE", "DANIEL", "JULIA", "MARIA"};
        for(int x =0; x<alunos.length; x++){
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x] );
        }
    }
}