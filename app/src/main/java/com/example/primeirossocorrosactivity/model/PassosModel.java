package com.example.primeirossocorrosactivity.model;

import java.io.Serializable;

public class PassosModel implements Serializable {
    private String textoPassos;
    private int imagemPassos;

    public PassosModel() {
    }

    public PassosModel(String textoPassos, int imagemPassos) {
        this.textoPassos = textoPassos;
        this.imagemPassos = imagemPassos;
    }

    public String getTextoPassos() {
        return textoPassos;
    }

    public void setTextoPassos(String textoPassos) {
        this.textoPassos = textoPassos;
    }

    public int getImagemPassos() {
        return imagemPassos;
    }

    public void setImagemPassos(int imagemPassos) {
        this.imagemPassos = imagemPassos;
    }
}
