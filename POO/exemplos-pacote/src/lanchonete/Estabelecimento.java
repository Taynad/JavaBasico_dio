package lanchonete;

import lanchonete.areaCliente.Cliente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //ações que estabelecimento precisa ter ciencia
        cozinheiro.adiconarComboNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();

        Almoxarife almoxarife = new Almoxarife();
        //ações que não precisam estarem disponíveis para toda a aplicação
        //almoxarife.controlarEntrada();
        //almoxarife.controlarSaida();
        //ações que somente o seu pacote de cozinha precisa saber
        //almoxarife.entregarIngredientes();
        //almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        //atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        //ações que somente o seu pacote de cozinha precisa saber
        //atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
        


    }

}
