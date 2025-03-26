package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    //pode ser default
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NATURAL NO BALCÃO");
    }

    //pode ser default
    public void adicionarSucoNoBalcao (){
        System.out.println("ADICIONANDO SUCO NATURAL NO BALCÃO");
    }

    //pode ser default
    public void adiconarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }

    private void prepararVitamina(){
        System.out.println("PREPARANDO VITAMINA");
    }

}
