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

    public static BancoDAO getInstance() {
        if (instance == null) {
            instance = new BancoDAO();
        }
        return instance;
    }
    
}
