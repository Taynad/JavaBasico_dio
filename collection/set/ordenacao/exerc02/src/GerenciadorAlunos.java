import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //atributos
    private Set<Aluno> alunoSet;
    //métodos
    public GerenciadorAlunos(Set<Aluno> alunoSet) {
        this.alunoSet = new HashSet<>();
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Set<Aluno> removerAluno = new HashSet<>();
        for(Aluno a : alunoSet){
            if(a.getMatricula().equals(matricula)){
                removerAluno.add(a);
                break;
            }
        }

        alunoSet.removeAll(removerAluno);
    }
    
    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!alunoSet.isEmpty()) {
            alunosPorNota.addAll(alunoSet);
            return alunosPorNota;
          } else {
            throw new RuntimeException("O conjunto está vazio!");
          }
    }



}
