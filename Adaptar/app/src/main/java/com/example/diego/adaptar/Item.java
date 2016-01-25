package com.example.diego.adaptar;

import java.io.Serializable;

/**
 * Created by jose on 21/01/2016.
 */
public class Item implements Serializable {
    private String nome;
    private String telefone;
    private int imagem;


    public int getImagem() {
        return imagem;
    }
    public void setImagem(int imagem){
        this.imagem = imagem;
    }

    public Item(String nome, String telefone, int imagem) {
        this.nome = nome;
        this.telefone = telefone;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}