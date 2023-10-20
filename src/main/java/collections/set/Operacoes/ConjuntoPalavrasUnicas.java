package main.java.collections.set.Operacoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public Set<String> getPalavrasSet() {
        return palavrasUnicasSet;
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(palavra);
    }
    public void removerPalavra(String palavra) {
        if(!palavrasUnicasSet.isEmpty()){
            if(palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            }
             else {
                System.out.println("Palavra não existe nesse conjunto");
             }
        } else {
            System.out.println("Conjunto vazio");
        }
    }
    public boolean verificarPalavra(String palavra) {
        //contains retorna boolean
        return palavrasUnicasSet.contains(palavra);
    }
    public void exibirPalavrasUnicas() {
        if(!palavrasUnicasSet.isEmpty()){
            System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("Conjunto vazio");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoCarros = new ConjuntoPalavrasUnicas();
    
        // Adicionando linguagens únicas ao conjunto
        conjuntoCarros.adicionarPalavra("Zafira");
        conjuntoCarros.adicionarPalavra("Corsa");
        conjuntoCarros.adicionarPalavra("Jeep");
        conjuntoCarros.adicionarPalavra("L200");
        conjuntoCarros.adicionarPalavra("Santa Fé");
        conjuntoCarros.adicionarPalavra("Ferrari");
    
        // Exibindo os carros únicas no conjunto
        conjuntoCarros.exibirPalavrasUnicas();
    
        // Removendo um carro do conjunto
        conjuntoCarros.removerPalavra("Jeep");
        conjuntoCarros.exibirPalavrasUnicas();
    
        // Removendo um carro inexistente
        conjuntoCarros.removerPalavra("Swift");
    
        // Verificando se um carro está no conjunto
        System.out.println("O carro 'L200' está no conjunto? " + conjuntoCarros.verificarPalavra("L200"));
        System.out.println("O carro 'Corsa' está no conjunto? " + conjuntoCarros.verificarPalavra("Corsa"));
    
        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoCarros.exibirPalavrasUnicas();
    }
}
