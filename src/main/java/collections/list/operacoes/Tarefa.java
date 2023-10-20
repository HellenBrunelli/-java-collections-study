package main.java.collections.list.operacoes;

public class Tarefa {
    // atributo descrição
    private String descricao;

    // construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    //metodo get p pegar o dado descrição
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return  descricao;
    }
    
}
