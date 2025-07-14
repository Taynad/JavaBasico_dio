import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //atributos
    private Map<String, Integer> palavrasMap;
    //métodos
    public ContagemPalavras(Map<String, Integer> palavrasMap) {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if(!palavrasMap.isEmpty()){
            palavrasMap.remove(palavra);
        }else{
            System.out.println("Palavra não encontrada!");
        }
    }

    public void exibirContagemPalavras(){
        System.out.println(palavrasMap);
    }


    //entry serve para fazer iteração, além disso conseguimos pegar um valor a atribuir um valor
    public String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavrasMap.entrySet()) {
          if (entry.getValue() > maiorContagem) {
            maiorContagem = entry.getValue();
            linguagemMaisFrequente = entry.getKey();
          }
        }
        return linguagemMaisFrequente;
      }
    
    

}
