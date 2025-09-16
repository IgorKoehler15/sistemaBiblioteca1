
# 📚 Sistema de Biblioteca em Java

Este projeto implementa um **sistema de gestão de livros para uma biblioteca** em Java.  
Ele permite cadastrar livros, listar, buscar, emprestar/devolver livros e consultar estatísticas da biblioteca.  

O sistema foi desenvolvido como atividade semanal (**M2S04**) e é ideal para estudo de **POO (Programação Orientada a Objetos)** em Java.

---

## 📂 Estrutura do Projeto

```
biblioteca-java/
│
├── Livro.java         # Classe modelo que representa um livro
├── Biblioteca.java    # Classe que representa a biblioteca e gerencia os livros
└── Main.java          # Classe principal com menu interativo
```

---

## ⚙️ Funcionalidades

1. **Cadastrar livro** – Adiciona um livro ao acervo da biblioteca.  
2. **Listar livros** – Exibe todos os livros cadastrados com código, título, autor e disponibilidade.  
3. **Buscar livro** – Pesquisa um livro pelo código.  
4. **Emprestar/Devolver livro** – Alterna o status de disponibilidade do livro.  
5. **Estatísticas** – Mostra o total de bibliotecas e livros cadastrados.  

---

## 🛠 Como Compilar e Executar

1. Abra o terminal na pasta do projeto.  
2. Compile todas as classes Java:

```bash
javac Livro.java Biblioteca.java Main.java
```

3. Execute o programa:

```bash
java Main
```

4. Utilize o menu interativo para gerenciar os livros da biblioteca.

---

## 💻 Exemplo de Uso

```text
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
```

### 📖 Listando livros

```text
===== LISTA DE LIVROS =====
Código: L001
Título: Java Básico
Autor: João Silva
Disponível: Sim
```

### 🔄 Emprestando um livro

```text
Digite o código do livro para emprestar/devolver: L001
Livro emprestado com sucesso!
```

### 📊 Estatísticas

```text
Total de bibliotecas criadas: 1
Total de livros cadastrados: 5
```

---

## 🔍 Observações

- Cada livro possui um **código único**.  
- O status de **disponível** indica se o livro pode ser emprestado.  
- Estatísticas incluem **total de bibliotecas criadas** e **total de livros cadastrados**.  
- O sistema utiliza **Scanner** para interação com o usuário.

---

## 💡 Melhorias Futuras

- Implementar **persistência de dados** usando arquivos ou banco de dados.  
- Permitir **busca por título ou autor**, não apenas por código.  
- Adicionar **controle de usuários** para empréstimos.  
- Criar **interface gráfica (GUI)** com JavaFX ou Swing.  

---

## 👤 Autor

**Igor Koehler** – Atividade semanal M2S04 – Curso de Java
