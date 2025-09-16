package com.igork.biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da biblioteca: ");
        String nomeBiblioteca = sc.nextLine().trim();

        Biblioteca biblioteca = new Biblioteca(nomeBiblioteca);

        int opcao;
        do {
            System.out.println("\n===== MENU BIBLIOTECA =====");
            System.out.println("[1] Cadastrar livro");
            System.out.println("[2] Listar livros");
            System.out.println("[3] Buscar livro");
            System.out.println("[4] Emprestar/Devolver livro");
            System.out.println("[5] Estatísticas");
            System.out.println("[6] Sair");
            System.out.print("Escolha uma opção: ");
            opcao = lerInt(sc);

            switch (opcao) {
                case 1 -> cadastrarLivro(sc, biblioteca);
                case 2 -> biblioteca.listarLivros();
                case 3 -> buscarLivro(sc, biblioteca);
                case 4 -> emprestarDevolver(sc, biblioteca);
                case 5 -> verEstatisticas();
                case 6 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        sc.close();
    }

    private static void cadastrarLivro(Scanner sc, Biblioteca biblioteca) {
        System.out.print("Código do livro: ");
        String codigo = sc.nextLine().trim();
        System.out.print("Título do livro: ");
        String titulo = sc.nextLine().trim();
        System.out.print("Autor do livro: ");
        String autor = sc.nextLine().trim();

        Livro livro = new Livro(codigo, titulo, autor);
        biblioteca.adicionarLivro(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    private static void buscarLivro(Scanner sc, Biblioteca biblioteca) {
        System.out.print("Informe o código do livro: ");
        String codigo = sc.nextLine().trim();

        Livro livro = biblioteca.buscarLivro(codigo);
        if (livro != null) {
            System.out.println("Livro encontrado: " + livro);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    private static void emprestarDevolver(Scanner sc, Biblioteca biblioteca) {
        System.out.print("Informe o código do livro: ");
        String codigo = sc.nextLine().trim();

        Livro livro = biblioteca.buscarLivro(codigo);
        if (livro != null) {
            livro.setDisponivel(!livro.isDisponivel());
            String status = livro.isDisponivel() ? "devolvido" : "emprestado";
            System.out.println("Livro " + status + " com sucesso!");
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    private static void verEstatisticas() {
        System.out.println("Total de bibliotecas: " + Biblioteca.getTotalBibliotecas());
        System.out.println("Total de livros cadastrados: " + Biblioteca.getTotalLivros());
    }

    private static int lerInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Digite um número válido: ");
            sc.next();
        }
        int valor = sc.nextInt();
        sc.nextLine(); // consumir \n
        return valor;
    }
}

