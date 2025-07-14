import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //atributo
    private Map<String, String> dicionarioMap;

    //métodos
    public Dicionario(Map<String, String> dicionarioMap) {
        this.dicionarioMap = new HashMap<>();
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }else{
            System.out.println("Palavra não encontrada");
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String pesquisarPalavra = null;
        if(!dicionarioMap.isEmpty()){
            pesquisarPalavra = dicionarioMap.get(palavra);
        }else{
            System.out.println("Palavra não encontrada");
        }

        return pesquisarPalavra;
    }



    

}
