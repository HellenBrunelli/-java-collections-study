package main.java.colletctions.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaDeNumeros;

    public OrdenacaoNumeros() {
        this.listaDeNumeros = new ArrayList<>();
    }
    public List<Integer> getListaDeNumeros() {
        return listaDeNumeros;
    }
    public void adicionarNumero(int numero) {
        listaDeNumeros.add(numero);
        // System.out.println(listaDeNumeros);
    }
    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.listaDeNumeros);
        if (!listaDeNumeros.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public List<Integer> ordenarDescendente() {
        // do maior p menor
        List<Integer> numerosDescendentes = new ArrayList<>(this.listaDeNumeros);
        if (!listaDeNumeros.isEmpty()) {
            numerosDescendentes.sort(Collections.reverseOrder());
            return numerosDescendentes;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirLista() {
        if(!listaDeNumeros.isEmpty()) {
            System.out.println("Exibindo lista: " + listaDeNumeros);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(5);
        numeros.adicionarNumero(8);
        numeros.adicionarNumero(15);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(20);

        
        numeros.exibirLista(); 

        System.out.println("crescente " + numeros.ordenarAscendente());

         numeros.exibirLista(); 

        System.out.println("decrescente " + numeros.ordenarDescendente());

        numeros.exibirLista(); 
        
        /* OUTPUT
        * Observa que a lista original não muda seu valor.
        * Exibindo lista: [5, 8, 15, 2, 20]
        * crescente [2, 5, 8, 15, 20]
        * Exibindo lista: [5, 8, 15, 2, 20]
        * decrescente [20, 15, 8, 5, 2]
        * Exibindo lista: [5, 8, 15, 2, 20]
        */
    }
}
