import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class App {
    public static void main(String[] args) throws Exception {
       /*
        *  2) Análise de Vendas Mensais (Map + Stream) Dado um Map<String, Double> contendo o nome do mês e o valor total de vendas:
        Exiba o mês com maior venda.
        Exiba o mês com menor venda.
        Calcule a média de vendas.
        Liste todos os meses com vendas acima da média.
        */

        Map<String, Double> vendasMensais = new HashMap<>();
        vendasMensais.put("Janeiro", 28509.45);
        vendasMensais.put("Fevereiro", 15978.34);
        vendasMensais.put("Março", 28421.95);
        vendasMensais.put("Abril", 25653.46);
        vendasMensais.put("Maio", 27268.65);

        Map.Entry<String, Double> mesComMaisVendas = vendasMensais.entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .orElse(null);
        
            System.out.println("O mês com maior venda foi: " + mesComMaisVendas);

            Map.Entry<String, Double> menorVenda = vendasMensais.entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .orElse(null);

            System.out.println("O mês com menor venda foi: " + menorVenda);

        
           
        

        

            
            
    }
}
