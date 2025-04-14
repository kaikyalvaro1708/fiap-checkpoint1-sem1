package br.com.fiap.checkpoint1.dto;

public class ProdutoRequestCreate {
    private String nome;

    public ProdutoRequestCreate(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
