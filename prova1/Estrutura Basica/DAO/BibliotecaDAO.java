package DAO;
import model.Material;

import java.util.ArrayList;

public class BibliotecaDAO {
    ArrayList<Material> materiais;
    private static BibliotecaDAO banco;

    private BibliotecaDAO()
    {
        materiais = new ArrayList<>();
    }

    public ArrayList<Material> getMateriais() {
        return materiais;
    }

    public static BibliotecaDAO getInstance()
    {
        if(banco == null)
        {
            banco = new BibliotecaDAO();
        }
        return banco;
    }
}
