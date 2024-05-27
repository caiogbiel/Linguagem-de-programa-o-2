import java.io.Serializable;

public class Livro implements Serializable{
    private String titulo;
    private String autor;
    private String assunto;
    private int anoLancamento;
    private int qtdEstoque;
    private StatusLivro status;

    public Livro(String titulo, String autor, String assunto, int anoLancamento, int qtdEstoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.assunto = assunto;
        this.anoLancamento = anoLancamento;
        this.qtdEstoque = qtdEstoque;
        this.status = StatusLivro.DISPONIVEL;
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

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public StatusLivro getStatus() {
        return status;
    }

    public void setStatus(StatusLivro status) {
        this.status = status;
    }
    
    
}
