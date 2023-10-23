package main.java.collections.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }
    
    public void adicionarPalavra(String palavra, Integer contagem) {
        palavras.put(palavra, contagem);
    } 
    public void removerPalavra(String palavra) {
        palavras.remove(palavra);
    } 
    public void exibirContagemPalavras() {
        System.out.println(palavras);
    } 
    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;

        if(!palavras.isEmpty()) {
            for(Map.Entry<String, Integer> entry : palavras.entrySet()) {
                if(entry.getValue() > maiorContagem) {
                    maiorContagem = entry.getValue();
                    palavraMaisFrequente = entry.getKey(); 
                }
            }
        }
        return palavraMaisFrequente;        
    }

    public static void main(String[] args) {
        ContagemPalavras contagem  = new ContagemPalavras();

        contagem.adicionarPalavra("Estudando", 2);
        contagem.adicionarPalavra("Curso", 1);
        contagem.adicionarPalavra("Java",4);
        contagem.adicionarPalavra("DIO", 7);


        contagem.exibirContagemPalavras();

        contagem.removerPalavra("Estudando");
        contagem.exibirContagemPalavras();


        System.out.println(contagem.encontrarPalavraMaisFrequente());
    }
}
