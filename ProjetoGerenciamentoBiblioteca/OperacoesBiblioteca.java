import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

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
    public void emprestarLivro(Usuario usuario, Livro livro) throws Exception{
       // verificar se existe livro, usuario e a situacao do livro
        if (!banco.listarUsuarios().contains(usuario)) {
            throw new Exception("Usuário não encontrado.");
        }
        if (!banco.listarLivros().contains(livro)) {
            throw new Exception("Livro não encontrado.");
        }
        if (livro.getStatus() == StatusLivro.EMPRESTADO) {
            throw new Exception("Livro já está emprestado.");
        }
        
        long emprestimosUsuario = banco.listarEmprestimosAtivos().stream().filter(emprestimo-> emprestimo.getUsuario().equals(usuario)).count();
        
        //verificar se usuario atingiu limite de emprestimo
        if(usuario instanceof Estudante && emprestimosUsuario >= 3) {
            throw new Exception("Estudantes podem pegar no máximo 3 livros.");
        }
        else if ((usuario instanceof Professores || usuario instanceof Bibliotecario) && emprestimosUsuario >= 5) {
            throw new Exception("Professores e Bibliotecários podem pegar no máximo 5 livros.");
        }
        
        livro.setStatus(StatusLivro.EMPRESTADO); //atualiza status
        
        //configura data devolucao pelo usuario
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DAY_OF_MONTH, usuario instanceof Estudante ? 15 : 30);
        Date dataDevolucao = cal.getTime();
        
        //fazer emprestimo
        Emprestimo emprestimo = new Emprestimo(usuario, livro, new Date(), dataDevolucao);
        banco.adicionarEmprestimo(emprestimo);
    }

    @Override
    public void devolverLivro(Usuario usuario, Livro livro) {
        try{
            if(banco.listarUsuarios().contains(usuario)){
                throw new Exception("Usuario nao encontrado");
            }
            if(banco.listarLivros().contains(livro)){
                throw new Exception("Livro nao encontrado");
            }
            
            Emprestimo emprestimoRemove = null;
            for(Emprestimo emprestimo : banco.listarEmprestimosAtivos()) {
                if(emprestimo.getUsuario().equals(usuario) && emprestimo.getLivro().equals(livro)){
                    emprestimoRemove = emprestimo;
                    break;
                }
            }
            
            if(emprestimoRemove == null){
                throw new Exception("Emprestimo nao encontrado");
            }
            
            //muda status livro
            livro.setStatus(StatusLivro.DISPONIVEL);
            //remove emprestimo
            banco.removerEmprestimo(emprestimoRemove);
        } catch(Exception e) {
            System.err.println("Erro ao devolver livro: " + e.getMessage());
        } 
            
    }
    

    @Override
    public void excluirLivro(Livro livro) {
        if(!banco.listarLivros().contains(livro)){
            System.out.println("Livro nao encontrado no banco DAO");
        }
        if(livro.getStatus() == StatusLivro.EMPRESTADO) {
            System.out.println("Nao é possivel excluir um livro emprestado");
        }
        banco.removerLivro(livro);
    }

    @Override
    public Livro pesquisarLivro(String criterio) throws Exception{
        for(Livro livro : banco.listarLivros()) {
            if(livro.getTitulo().contains(criterio) || livro.getAutor().contains(criterio) || livro.getAssunto().contains(criterio)){
                return livro;
            }
        }
        throw new Exception("Livro nao encontrado");
    }

    @Override
    public void verificarSituacaoUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
