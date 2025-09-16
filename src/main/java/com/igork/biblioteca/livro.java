package com.igork.biblioteca;

public class Livro {

    private String codigo;
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; // todo livro começa disponível
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    // Alterar disponibilidade
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return String.format("Código: %s | Título: %s | Autor: %s | Disponível: %s",
                codigo, titulo, autor, disponivel ? "Sim" : "Não");
    }
}

