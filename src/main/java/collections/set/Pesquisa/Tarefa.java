package main.java.colletctions.set.Pesquisa;

public class Tarefa {
    //Atributos
    private String descrição;
    private boolean tarefaConcluida;

    public Tarefa(String descrição, boolean tarefaConcluida) {
        this.descrição = descrição;
        this.tarefaConcluida = tarefaConcluida;
    }

    public String getDescrição() {
        return descrição;
    }

    public boolean isTarefaConcluida() {
        return tarefaConcluida;
    }

    public void setTarefaConcluida(boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }

    @Override
    public String toString() {
        return "Tarefa: [" + descrição + "," + tarefaConcluida + "]";
    }
    
}
