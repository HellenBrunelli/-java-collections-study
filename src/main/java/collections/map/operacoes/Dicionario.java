package main.java.collections.map.operacoes;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }
    public void removerPalavra(String palavra) {
        dicionarioMap.remove(palavra);
    }
    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }
    public String pesquisarPorPalavra(String palavra) {
        String descriçãoPorPalavra = null;

        if(!dicionarioMap.isEmpty()) {
            // o get busca o valor pela chave 
            descriçãoPorPalavra =  dicionarioMap.get(palavra);
        }
        return descriçãoPorPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Estudar", "Procurar adquirir o conhecimento de algo");
        dicionario.adicionarPalavra("Trabalhar", "Dedicar-se a uma atividade, desempenhar um emprego");
        dicionario.adicionarPalavra("Gratidão", "Reconhecimento por um benefício recebido; agradecimento");
        dicionario.adicionarPalavra("Reclamação", "Ato de se opor através das palavras");


        dicionario.exibirPalavras();

        dicionario.removerPalavra("Reclamação");

        dicionario.exibirPalavras();

        System.out.println("Resultado pesquisa: " + dicionario.pesquisarPorPalavra("Gratidão"));
    }


    
    
}
