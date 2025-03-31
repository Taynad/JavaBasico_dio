package enumEXemplo;

public enum EstadoBrasieiro {
    SAO_PAULO, RIO_DE_JANEIRO, PIAUI, MARANHAO;

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
