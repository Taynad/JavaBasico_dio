import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaSet;
    //métodos
    public ListaTarefas(Set<Tarefa> listaSet) {
        this.listaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao){
        Set<Tarefa> removTarefas = new HashSet<>();
        for(Tarefa t : listaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
               removTarefas.add(t);
            }
        }
        listaSet.removeAll(removTarefas);
    }

    public void exibirTarefas(){
        System.out.println(listaSet);
    }

    public void contarTarefas(){
        System.out.println("O número total de tarefas são: " + listaSet.size());
    }

    public void obterTarefasConcluidas(){
        Set<Tarefa> tarefaConcluida = new HashSet<>();
        for(Tarefa t : listaSet){
            if(t.getStatus()==true){
                tarefaConcluida.add(t);
            }
        }
        System.out.println("Tarefas concluídas: " + tarefaConcluida);
    }

    public void obterTarefasPendentes(){
        Set<Tarefa> tarefaPendentes = new HashSet<>();
        for(Tarefa t : listaSet){
            if(t.getStatus()==false){
                tarefaPendentes.add(t);
            }
        }
        System.out.println("Tarefas pendentes: " + tarefaPendentes);
    }

    public Tarefa marcarTarefaConcluida(String descricao){
        Tarefa tarefaAtualizada = null;

        for(Tarefa t : listaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setStatus(true);
                tarefaAtualizada = t;
            }
        }

        return tarefaAtualizada;

    }

    public Tarefa marcarTarefaPendente(String descricao){
        Tarefa tarefaPendente = null;

        for(Tarefa t : listaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setStatus(false);
                tarefaPendente = t;
            }
        }

        return tarefaPendente;
    }

    public void limparListaTarefas(){
        System.out.println("Tarefas excluídas " + listaSet.removeAll(listaSet));
    }
    
    

}
