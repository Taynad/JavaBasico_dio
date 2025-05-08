package enumEXemplo;

public enum EstadoBrasieiro {
    
    private String nome;
    private String sigla;
    
    private EstadoBrasieiro(String nome,  String sigla){
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    

}
