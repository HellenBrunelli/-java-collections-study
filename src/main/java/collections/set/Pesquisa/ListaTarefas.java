package main.java.collections.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaSetRemover = null;

        if(!tarefaSet.isEmpty()) {
            for(Tarefa t: tarefaSet) {
                if(t.getDescrição().equalsIgnoreCase(descricao)) {
                    tarefaSetRemover = t;
                    break;
                }
            }
            
        } else {
            System.out.println("Set está vazio");
        }

        tarefaSet.remove(tarefaSetRemover);
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasSetConcluidas = new HashSet<>();

        if(!tarefaSet.isEmpty()) {
            for(Tarefa t: tarefaSet) {
                if(t.isTarefaConcluida()) {
                    tarefasSetConcluidas.add(t);
                }
            }
        } else {
            System.out.println("Set está vazio");
        }

        return tarefasSetConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasSetNaoConcluidas = new HashSet<>();

        if(!tarefaSet.isEmpty()) {
            for(Tarefa t: tarefaSet) {
                if(!t.isTarefaConcluida()) {
                    tarefasSetNaoConcluidas.add(t);
                }
            }
        } else {
            System.out.println("Set está vazio");
        }

        return tarefasSetNaoConcluidas;
    }

    public void marcarTarefaConcluida(String descricao) {
        if(!tarefaSet.isEmpty()) {
            for(Tarefa t: tarefaSet) {
                if(t.getDescrição().equalsIgnoreCase(descricao)) {
                    t.setTarefaConcluida(true);
                    break;
                }
            }
        } else {
            System.out.println("Set está vazio");
        }
    }

     public void marcarTarefaPendente(String descricao) {
        if(!tarefaSet.isEmpty()) {
            for(Tarefa t: tarefaSet) {
                if(t.getDescrição().equalsIgnoreCase(descricao)) {
                    t.setTarefaConcluida(false);
                    break;
                }
            }
        } else {
            System.out.println("Set está vazio");
        }
    }
    public void limparListaTarefas() {
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        //Adicionando tarefas
        listaTarefas.adicionarTarefa("Aprender Java");
        listaTarefas.adicionarTarefa("Aprender Angular");
        listaTarefas.adicionarTarefa("Aprender Typescript");

        //Exibir Tarefas
        // listaTarefas.exibirTarefas();

        //exibir qtdade de tarefas
        // System.out.println(listaTarefas.contarTarefas());

        // marcando tarefa como concluida
        listaTarefas.marcarTarefaConcluida("Aprender Java");

        // listar tarefas concluidas
        System.out.println("Tarefas já concluídas: " + listaTarefas.obterTarefasConcluidas());

        //listar as tarefas não concluidas
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        //limpar lista de tarefas
        System.out.println("Limpando Lista de Tarefas...");
        listaTarefas.limparListaTarefas();

        // exibir lista tarefas 
        System.out.println("Temos " + listaTarefas.contarTarefas() + " tarefas na lista");
    }
}
