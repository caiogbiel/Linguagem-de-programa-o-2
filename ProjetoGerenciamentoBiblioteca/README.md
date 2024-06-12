# Sistema de Gerenciamento de Biblioteca

## Visão Geral

Este projeto é uma implementação de um sistema de gerenciamento de biblioteca. Ele permite a adição, remoção e empréstimo de livros, além da gestão de usuários e empréstimos ativos. O sistema segue o padrão de design Singleton para garantir que apenas uma instância do banco de dados (BancoDAO) seja criada e usada durante a execução do programa.

## Estrutura do Projeto

### Pacotes

- **modelo:** Contém classes que representam as entidades principais do sistema (Usuario, Livro, Emprestimo, etc.).
- **dao:** Contém a classe responsável pelo acesso e manipulação dos dados (BancoDAO).
- **servico:** Contém a classe que implementa as operações de serviço da biblioteca (OperacoesBiblioteca).
- **util:** Contém a interface com as operações a serem implementadas (Operacoes).

### Classes e Métodos

#### BancoDAO

- **Descrição:** Singleton que simula um banco de dados para armazenar usuários, livros e empréstimos.
- **Métodos:**
    - `getInstance()`: Retorna a única instância de BancoDAO.
    - `adicionarUsuario(Usuario usuario)`: Adiciona um usuário ao banco de dados.
    - `removerUsuario(Usuario usuario)`: Remove um usuário do banco de dados.
    - `adicionarLivro(Livro livro)`: Adiciona um livro ao banco de dados.
    - `removerLivro(Livro livro)`: Remove um livro do banco de dados.
    - `adicionarEmprestimo(Emprestimo emprestimo)`: Adiciona um empréstimo ativo ao banco de dados.
    - `removerEmprestimo(Emprestimo emprestimo)`: Remove um empréstimo ativo do banco de dados.
    - `pesquisaUsuario(String cpf)`: Pesquisa um usuário pelo CPF.
    - `pesquisaLivro(String titulo)`: Pesquisa um livro pelo título.
    - `pesquisarEmprestimo(Usuario usuario)`: Pesquisa um empréstimo ativo pelo usuário.
    - `listarUsuarios()`: Retorna uma lista de todos os usuários.
    - `listarLivros()`: Retorna uma lista de todos os livros.
    - `listarEmprestimosAtivos()`: Retorna uma lista de todos os empréstimos ativos.

#### Usuario

- **Descrição:** Classe abstrata que representa um usuário da biblioteca.
- **Atributos:** nome, cpf, matricula, dataNascimento.
- **Métodos:** Getters e setters para os atributos.

#### Estudante (Extende Usuario)

- **Descrição:** Representa um estudante usuário da biblioteca.
- **Atributos:** curso.
- **Métodos:** Getters e setters para curso e atributos herdados.

#### Bibliotecario (Extende Usuario)

- **Descrição:** Representa um bibliotecário usuário da biblioteca.
- **Atributos:** login, senha.
- **Métodos:** Getters e setters para login, senha e atributos herdados.

#### Livro

- **Descrição:** Representa um livro no sistema da biblioteca.
- **Atributos:** titulo, autor, assunto, anoLancamento, qtdEstoque, status.
- **Métodos:** Getters e setters para os atributos.

#### Emprestimo

- **Descrição:** Representa um empréstimo de livro.
- **Atributos:** usuario, livro, dataEmprestimo, dataDevolucao.
- **Métodos:** Getters e setters para os atributos.

#### Operacoes

- **Descrição:** Interface que define operações de serviço da biblioteca.
- **Métodos:**
    - `adicionarLivro(Livro livro)`: Adiciona um livro ao sistema.
    - `emprestarLivro(Usuario usuario, Livro livro) throws Exception`: Empresta um livro a um usuário.
    - `devolverLivro(Usuario usuario, Livro livro) throws Exception`: Devolve um livro emprestado.
    - `excluirLivro(Livro livro)`: Exclui um livro do sistema.
    - `pesquisarLivro(String criterio) throws Exception`: Pesquisa um livro no sistema.
    - `verificarSituacaoUsuario(Usuario usuario)`: Verifica a situação de empréstimo de um usuário.

#### OperacoesBiblioteca

- **Descrição:** Implementa as operações definidas na interface Operacoes.
- **Métodos:**
    - `adicionarLivro(Livro livro)`: Implementa a lógica para adicionar um livro, verificando se já existe no catálogo.
    - `emprestarLivro(Usuario usuario, Livro livro) throws Exception`: Implementa a lógica para emprestar um livro, verificando se o usuário e o livro existem, e se o usuário pode realizar o empréstimo.
    - `devolverLivro(Usuario usuario, Livro livro) throws Exception`: Implementa a lógica para devolver um livro, atualizando o status do livro e removendo o empréstimo do sistema.
    - `excluirLivro(Livro livro)`: Implementa a lógica para excluir um livro, verificando se está emprestado.
    - `pesquisarLivro(String criterio) throws Exception`: Implementa a lógica para pesquisar um livro por título, autor ou assunto.
    - `verificarSituacaoUsuario(Usuario usuario)`: Implementa a lógica para verificar a situação de empréstimo de um usuário.

## Manual de Usuário

### Como Usar o Sistema de Gerenciamento de Biblioteca

1. **Inicialização do Sistema**
    - Crie uma instância de `OperacoesBiblioteca` para realizar operações na biblioteca.
   ```java
   OperacoesBiblioteca operacoes = new OperacoesBiblioteca();

2. **Adicionar um Livro**
    - Para adicionar um livro ao sistema:
   ```java
    Livro livro = new Livro("Título", "Autor", "Assunto", 2023, 5);
    operacoes.adicionarLivro(livro);
   
3. **Emprestar um Livro**
    - Para emprestar um livro a um usuário:
   ```java
    Usuario usuario = new Estudante("Nome", "CPF", "Matricula", "DataNascimento", "Curso");
    Livro livro = new Livro("Título", "Autor", "Assunto", 2023, 5);
    try {
    operacoes.emprestarLivro(usuario, livro);
    } catch (Exception e) {
    System.out.println("Erro: " + e.getMessage());
    }
4. **Devolver um Livro**
   - Para devolver um livro emprestado:
   ```java
   try {
    operacoes.devolverLivro(usuario, livro);
    } catch (Exception e) {
    System.out.println("Erro: " + e.getMessage());
    }

5. **Excluir um Livro**
    - Para excluir um livro do sistema:
    ```java
   operacoes.excluirLivro(livro);

6. **Pesquisar um Livro**
   - Para pesquisar um livro pelo título, autor ou assunto:
    ```java
   try {
    Livro livroEncontrado = operacoes.pesquisarLivro("Título");
    System.out.println("Livro encontrado: " + livroEncontrado.getTitulo());
    } catch (Exception e) {
    System.out.println("Erro: " + e.getMessage());
    }

7. **Verificar Situação do Usuário**
    - Para verificar a situação de empréstimo de um usuário:
   ```java
   operacoes.verificarSituacaoUsuario(usuario);

## Estrutura MVC

O projeto está organizado seguindo a arquitetura MVC (Model-View-Controller):

- **Model:** Contém as classes que representam os dados (Usuario, Livro, Emprestimo).
- **DAO:** Contém a classe que gerencia o acesso e a manipulação dos dados (BancoDAO).
- **Service:** Contém a lógica de negócio e manipulação dos dados (OperacoesBiblioteca).
- **Controller:** É implementado para gerenciar a interação entre a interface do usuário e o serviço, controlando as operações conforme necessário.

Essa estrutura modulariza o código, facilitando a manutenção e a escalabilidade do sistema.
