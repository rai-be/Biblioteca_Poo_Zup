import RunTimeException.RunTimeException;

public class Livro extends ItemBibliografico {

    public String autor;
    public String isbn;

    public Livro (String autor, String isbn, String codigo, String titulo, int anoPublicacao) {
        super(codigo, titulo, anoPublicacao);  // Chama o construtor da classe mãe ItemBibliografico
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean validarCampos() throws RunTimeException {

        if (this.getIsbn().length() < 10 || this.getIsbn().length() > 13) { //objeto.metodo1().metodo2()
            throw new RunTimeException("isbn invalido");
        }
        if (autor == null) {
            throw new RunTimeException("isbn invalido");
        }

        return true;
    }

    @Override
    public String toString() {
        return super.toString() + " autor: " + autor + ", isbn: " + isbn;
    }
}


