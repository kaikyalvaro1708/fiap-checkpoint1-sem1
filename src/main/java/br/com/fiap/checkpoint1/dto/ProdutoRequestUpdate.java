package br.com.fiap.checkpoint1.dto;

public class ProdutoRequestUpdate {
    private String nome;

    public ProdutoRequestUpdate(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
