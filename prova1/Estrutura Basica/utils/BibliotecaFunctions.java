package utils;

import DAO.BibliotecaDAO;
import model.Material;

public abstract class BibliotecaFunctions {
    BibliotecaDAO banco =BibliotecaDAO.getInstance();

    public String pesquisarMaterial(String titulo)
    {
        for(Material m : banco.getMateriais())
        {
            if(m.equals(titulo))
            {
                return m.toString();
            }
        }
        return null;
    }
    public void listaMaterias()
    {
        System.out.println("Lista de materiais disponiveis: ");
        for (Material m : banco.getMateriais())
        {
            if(m != null)
            {
                System.out.println("Material: " + banco.getMateriais());
            }
        }
    }
    public Material cadastrarMaterial(String titulo, String autor, int anoLancamento, String edicao)
    {

    }
}
