import java.util.List;
import java.util.ArrayList;

public class OperacoesBiblioteca implements Operacoes{

    private BancoDAO banco;
    
    public OperacoesBiblioteca() {
        this.banco = BancoDAO.getInstance();
    }
    
    @Override
    public void adicionarLivro(Livro livro) {
        List<Livro> livros = banco.listarLivros();
        for(Livro l: livros) {
            if(l.getTitulo().equalsIgnoreCase(livro.getTitulo()) && l.getAutor().equalsIgnoreCase(livro.getAutor())) {
                System.out.println("Erro: Livro já existe no catálogo.");
                return;
            }
        }
        banco.adicionarLivro(livro);
        System.out.println("Livro adicionado com sucesso");
    }

    @Override
    public void emprestarLivro(Usuario usuario, Livro livro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void devolverLivro(Livro livro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void excluirLivro(Livro livro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void pesquisarLivro(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void verificarSituacaoUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
