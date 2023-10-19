package main.java.colletctions.list.operacoes;

import java.util.ArrayList;
import java.util.List;

/** CHALLENGE **/

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    //construtor
    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, int quantidade) {
        listaItens.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome) {
        List<Item> excluirItem = new ArrayList<>();

        if(!listaItens.isEmpty()) {
            for(Item item: listaItens) {
                if(item.getNome().equalsIgnoreCase(nome)) {
                    excluirItem.add(item);
                }
            }
        }
        listaItens.removeAll(excluirItem);

    }
    public void exibirItens() {
        System.out.println(listaItens);
    }
    public int itemsArray() {
        // retornando inteiro referente ao tamanho do array
        return listaItens.size();
    }
    public double calcularValorTotal() {
        double valorTotal = 0.00;

        if(!listaItens.isEmpty()) {
            for(Item item: listaItens) {
                valorTotal += item.getPreco() * item.getQuantidade();
            }
        }
        return valorTotal;
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        System.out.println("Vou adicionar os itens no carrinho:");
        carrinho.adicionarItem("Iphone", 9000.00, 1);
        carrinho.adicionarItem("Xiaomi", 1500.00, 3);
        carrinho.adicionarItem("Sansung", 1790.00, 2);

        int items = carrinho.itemsArray();
        System.out.println("A lista tem " + items + " itens.");
        
        System.out.println("Removendo um item");
        carrinho.removerItem("Sansung");

        System.out.println("Agora a lista tem " + carrinho.itemsArray() + " itens.");

        System.out.println("Exibir itens:");
        carrinho.exibirItens();

        double total = carrinho.calcularValorTotal();
        System.out.println("O valor total no carrinho é de: R$ " + total);
    }   
}
