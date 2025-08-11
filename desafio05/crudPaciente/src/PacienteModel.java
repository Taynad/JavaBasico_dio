public class PacienteModel {
    //atributos
    private String nome;
    private String cpf;
    private String consulta;

    //construtor
    public PacienteModel(String nome, String cpf, String consulta) {
        this.nome = nome;
        this.cpf = cpf;
        this.consulta = consulta;
    }

    //getter e setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getConsulta() {
        return consulta;
    }
    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    @Override
    public String toString() {
        return "Paciente: [nome=" + nome + ", cpf=" + cpf + ", consulta=" + consulta + "]";
    }

    

    

}
