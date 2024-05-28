public interface Operacoes {
    void adicionarLivro(Livro livro);
    void emprestarLivro(Usuario usuario, Livro livro);
    void devolverLivro(Livro livro);
    void excluirLivro(Livro livro);
    void pesquisarLivro(String criterio);
    void verificarSituacaoUsuario(Usuario usuario);    
}
