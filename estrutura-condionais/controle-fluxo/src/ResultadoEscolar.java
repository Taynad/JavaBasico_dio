public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        //condional composta
        System.out.println("---Condicional composta");
        if(nota >=7){
            System.out.println("Aprovado!!!");
        }else{
            System.out.println("Reprovado :( :( ");
        }

        //condição encadeada
        int nota2 = 6;
        System.out.println("---Condição encadeada---");
        if(nota2 > 7){
            System.out.println("Aprovado!!!");
        }else if(nota >= 5 && nota <7){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado :( :( ");
        }

        //condição ternária (usada para abrevião de algoritmos)
        int nota3 = 7;
        System.out.println("---Condição ternária---");
        String resultado = nota3>=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);



    }
    
}
