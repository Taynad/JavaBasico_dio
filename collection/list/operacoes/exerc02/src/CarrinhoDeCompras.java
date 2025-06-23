import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private List<Item> item;

    //construtor
    public CarrinhoDeCompras(){
        this.item = new ArrayList<>();
    }

    //métodos
    public void adicionarItem(String nome, double preco, int quantidade){
        item.add(new Item(nome,preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> ItemParaRemover = new ArrayList<>();
        for(Item i : item){
            if(i.getNome().equalsIgnoreCase(nome)){
                ItemParaRemover.add(i);
            }
        }
        item.removeAll(ItemParaRemover);
    }

    public Double calcularValorTotal(){
        double total = 0.0;
        for (Item i : item) {
            total += i.getPreco() * i.getQuantidade();
    }
    return total;
    }

    public void exibirItens(){
        System.out.println(item);
    }

}
