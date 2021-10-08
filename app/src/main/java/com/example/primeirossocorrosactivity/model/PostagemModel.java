package com.example.primeirossocorrosactivity.model;

public class PostagemModel {

    private int imagePostagem;
    private String textoButton;

    public PostagemModel() {
    }

    public PostagemModel(int imagePostagem, String textoButton) {
        this.imagePostagem = imagePostagem;
        this.textoButton = textoButton;
    }

    public String getTextoButton() {
        return textoButton;
    }

    public void setTextoButton(String textoButton) {
        this.textoButton = textoButton;
    }

    public int getImagePostagem() {
        return imagePostagem;
    }

    public void setImagePostagem(int imagePostagem) {
        this.imagePostagem = imagePostagem;
    }
}
