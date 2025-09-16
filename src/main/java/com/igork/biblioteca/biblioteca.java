package com.igork.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nome;
    private List<Livro> livros;
    private static int totalLivros = 0;
    private static int totalBibliotecas = 0;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
        totalBibliotecas++;
    }

    public void adicionarLivro(Livro livro) {
        if (livro != null) {
            livros.add(livro);
            totalLivros++;
        }
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("=== Livros da Biblioteca " + nome + " ===");
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }

    public Livro buscarLivro(String codigo) {
        for (Livro livro : livros) {
            if (livro.getCodigo().equalsIgnoreCase(codigo)) {
                return livro;
            }
        }
        return null;
    }

    public static int getTotalLivros() {
        return totalLivros;
    }

    public static int getTotalBibliotecas() {
        return totalBibliotecas;
    }
}

