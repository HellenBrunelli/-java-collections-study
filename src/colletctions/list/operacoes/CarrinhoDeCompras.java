package colletctions.list.operacoes;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    //construtor
    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public static void main(String[] args) {
        
    }

    public void adicionarItem(String nome, Double preco, int quantidade) {
        listaItens.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome) {
        List<Item> listExcluirItem = new ArrayList<>();

        for(Item i: listaItens) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                listExcluirItem.add(i);
            }
        }
    }
    public void calcularValorTotal() {

    }
    public void exibirItens() {

    }
    
}
