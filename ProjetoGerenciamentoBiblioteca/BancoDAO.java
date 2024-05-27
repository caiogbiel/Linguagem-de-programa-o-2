import java.util.ArrayList;
import java.util.List;

public class BancoDAO {
    private static BancoDAO instance;
    private List<Usuario> usuarios;
    private List<Livro> livros;
    private List<Emprestimo> emprestimosAtivos;

    private BancoDAO() {
        usuarios = new ArrayList<>();
        livros = new ArrayList<>();
        emprestimosAtivos = new ArrayList<>();
    }
    // metodo singleton(instancia do BancoDAO)
    public static BancoDAO getInstance() {
        if (instance == null) {
            instance = new BancoDAO();
        }
        return instance;
    }
    //metodos de adicionar e remover usuario
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    public void removerUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }
    //metodos de adicionar e remover livro
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }
    //metodos de adicionar e remover emprestimo
    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimosAtivos.add(emprestimo);
    }
    public void removerEmprestimo(Emprestimo emprestimo) {
        emprestimosAtivos.remove(emprestimo);
    }
    //metodo para pesquisar usuario
    public Usuario pesquisaUsuario(String cpf) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCpf().equals(cpf)) {
                return usuario;
            }
        }
        return null; // Retorna null se não encontrar o usuário
    }
    //metodo para pesquisar livro
    public Livro pesquisaLivro(String titulo) {
        for(Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }
    //metodo para pesquisar emprestimos
    public Emprestimo pesquisarEmprestimo(Usuario usuario) {
        for(Emprestimo emprestimo : emprestimosAtivos) {
            if (emprestimo.getUsuario().equals(usuario)) {
                return emprestimo;
            }
        }
        return null;
    }
}
