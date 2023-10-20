package main.java.collections.list.operacoes;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo lista de tarefas
    // List <Tarefas> genérics onde o Tarefas é nosso arquivo Tarefas.java, tarefaList é o nome da variável
    private List<Tarefa> tarefaList;

    // construtor 
    public ListaTarefa() {
        // criamos um novo array list
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    //
    public void removerTarefa(String descricao) {
        // criando novo array c itens para excluir
        List<Tarefa> listaExclusao = new ArrayList<>();
        
        // inteirando sobre a lista de tarefas para encontrar a descrição igual
        for (Tarefa t: tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                //adicionando tarefa igual na lista de remover
                listaExclusao.add(t);
            }
        }
        // Remova da lista de tarefas todas as tarefas que estão na lista de exclusão
        tarefaList.removeAll(listaExclusao);
    }
    public int obterNumeroTotalTarefas() {
        // retornando inteiro referente ao tamanho do array
        return tarefaList.size();
    }
    public void obterDescricoesTarefas() {
        // printando a lista de tarefas
       System.out.println(tarefaList);

    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 2");

        // listaTarefa.removerTarefa("Tarefa 1");

        // System.out.println("Tamanho da lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
