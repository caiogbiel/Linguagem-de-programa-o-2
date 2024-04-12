package model;

public class Revista implements Material
{

   private String titulo;
    private String editora;
    private int numeroPaginas;

    public Revista() {
    }

    public Revista(String titulo, String editora, int numeroPaginas) {
        this.titulo = titulo;
        this.editora = editora;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Titulo: " + this.titulo + " Editora: " + this.editora +
                " Numero Paginas: " + this.numeroPaginas);
    }
}