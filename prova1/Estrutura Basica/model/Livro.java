package model;

public class Livro implements Material {
   private String titulo;
    private String autor;
    private int anoLancamento;
    private String edicao;

    public Livro() {
    }

    public Livro(String titulo, String autor, int anoLancamento, String edicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.edicao = edicao;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Titulo: " + this.titulo + " Autor: " + this.autor +
                " Ano Lancamento: " + this.anoLancamento + " Edicao: " + this.edicao);
    }
}
