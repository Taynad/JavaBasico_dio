import java.util.ArrayList;
import java.util.List;

public class PacienteService {
    //atributo
    private List<PacienteModel> paciente = new ArrayList<>();
    private PacienteModel pacienteModel;

    //métodos
    public void createPaciente (PacienteModel pacienteModel){
        
        boolean existe = paciente.stream()
            .anyMatch(p -> p.equals(pacienteModel));

        if (existe) {
            System.out.println("Paciente ja cadastrado!");
        }

        paciente.add(pacienteModel);

        System.out.println("Paciente cadastrado com sucesso!");
        System.out.println("200 OK");
    }

    public List<PacienteModel> readPaciente(){
        if(paciente.isEmpty()){
            System.out.println("Nenhum cadastro feito");
        }
        return paciente; 
    }

    public void updateConsulta (String cpf, String consulta){

        boolean existe = paciente.stream()
            .anyMatch(p -> p.getCpf().equals(cpf));

        if (!existe) {
            System.out.println("Paciente não cadastrado!");
        }
        
        paciente.stream()
            .filter(p -> p.getCpf().equals(cpf))
            .findAny()
            .ifPresent(p -> p.setConsulta(consulta));

        System.out.println("Paciente atualizado com sucesso!");
    }

    public void deletePaciente (String cpf){
        boolean existe = paciente.stream()
            .anyMatch(p -> p.getCpf().equals(cpf));

        if (!existe) {
            System.out.println("Paciente não cadastrado!");
        }

        paciente.stream()
            .filter(p -> p.getCpf().equals(cpf))
            .findAny()
            .ifPresent(p -> paciente.remove(p));
        
        System.out.println("Paciente deletado com sucesso!");
    }



    

}
