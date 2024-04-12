package utils;

import DAO.BibliotecaDAO;
import model.Livro;
import model.Material;
import model.Revista;

public abstract class BibliotecaFunctions {
    protected static BibliotecaDAO banco = BibliotecaDAO.getInstance();

    public static Material pesquisarMaterial(String titulo)
    {
        for(Material m : banco.getMateriais())
        {
            if(m.equals(titulo))
            {
                return m;
            }
        }
        return null;
    }
    public static void exibirListaMateriais()
    {
        System.out.println("Lista de materiais disponiveis: ");
        for (Material m : banco.getMateriais())
        {
            if(m != null)
            {
                m.exibirDetalhes();
            }
        }
    }
    public static void cadastrarMaterial(String titulo, String autor, int anoLancamento, String edicao) {
        Livro novoLivro = new Livro(titulo, autor, anoLancamento, edicao);
        banco.getMateriais().add(novoLivro);
    }
    public static void cadastrarMaterial(String titulo, String editora, int numeroPaginas) {
        Revista novaRevista = new Revista(titulo, editora, numeroPaginas);
        banco.getMateriais().add(novaRevista);
    }
    public static void removerMaterial(String titulo)
    {
        Material material = pesquisarMaterial(titulo);

        if(material != null)
        {
            banco.getMateriais().remove(material);
            System.out.println("Material de titulo: " + titulo + " removido");
        } else {
            System.out.println("Material de titulo: " + titulo + " nao encontrado");
        }
    }
    private static Material buscaPorNome(String titulo)
    {
        for(Material m : banco.getMateriais())
        {
            if(m.equals(titulo))
            {
                return m;
            }
        }
        return null;
    }
}
