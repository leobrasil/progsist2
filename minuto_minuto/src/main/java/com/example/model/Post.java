package com.example.model;

public class Post {
    private int id;
    private String titulo;
    private String texto;

    public Post(int id, String titulo, String texto) {
        this.id = id;
        this.titulo = titulo;
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Post [id=" + id + ", titulo=" + titulo + ", texto=" + texto + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}
