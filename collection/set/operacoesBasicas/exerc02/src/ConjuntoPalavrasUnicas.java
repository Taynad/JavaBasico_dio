import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributo
    private Set<String> palavrasSet;
    //construtor
    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }
    //métodos
    public void adicionarPalavra(String palavra){
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(!palavrasSet.isEmpty()){
            if(palavrasSet.contains(palavra)){
                palavrasSet.remove(palavra);
            }else{
                System.out.println("Palavra não encontrada");
            }
        }else{
            System.out.println("Conjunto está vazio");
        }
    }

    public boolean verificarPalavra(String palavra){
       return palavrasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if(!palavrasSet.isEmpty()){
            System.out.println(palavrasSet);
        }else{
            System.out.println("Conjunto está vazio");
        }
    }


    

    
    

}
