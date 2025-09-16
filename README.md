Sistema de Biblioteca em Java

Este projeto implementa um sistema de gestão de livros para uma biblioteca em Java. Ele permite cadastrar livros, listar, buscar, emprestar/devolver e consultar estatísticas da biblioteca.

O sistema foi desenvolvido como atividade semanal (M2S04) e deve ser entregue via GitHub.

Estrutura do Projeto

Livro.java – Classe modelo que representa um livro.

Biblioteca.java – Classe que representa a biblioteca e gerencia os livros.

Main.java – Classe principal com menu interativo para o usuário.

Funcionalidades

Cadastrar livro – Adiciona um livro ao acervo da biblioteca.

Listar livros – Exibe todos os livros cadastrados, com código, título, autor e disponibilidade.

Buscar livro – Pesquisa um livro pelo código.

Emprestar/Devolver livro – Alterna o status de disponibilidade do livro.

Estatísticas – Mostra o total de bibliotecas e livros cadastrados.

Como Compilar e Executar

Abra o terminal na pasta do projeto.

Compile todas as classes Java:

javac Livro.java Biblioteca.java Main.java


Execute o programa:

java Main


Siga o menu interativo para cadastrar livros, fazer buscas, empréstimos e consultar estatísticas.

Exemplo de Uso
Digite o nome da biblioteca: Biblioteca Central

===== MENU BIBLIOTECA =====
[1] Cadastrar livro
[2] Listar livros
[3] Buscar livro
[4] Emprestar/Devolver livro
[5] Estatísticas
[6] Sair
Escolha uma opção: 1
Código do livro: L001
Título do livro: Java Básico
Autor do livro: João Silva
Livro cadastrado com sucesso!

Observações

Cada livro possui um código único.

O status de disponível indica se o livro pode ser emprestado.

Estatísticas incluem total de bibliotecas criadas e total de livros cadastrados.

Autor

Igor Koehler – Atividade semanal M2S04 – Curso de Java
