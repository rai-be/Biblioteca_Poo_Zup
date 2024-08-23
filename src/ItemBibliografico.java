import RunTimeException.RunTimeException;
import java.util.Calendar;

    public abstract class ItemBibliografico {

    private String codigo;
    private String titulo;
    private int anoPublicacao;

    public ItemBibliografico(String codigo, String titulo, int anoPublicacao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }


    public ItemBibliografico() {

    }

    public String getcodigo() {
        return codigo;
    }

    public String getitulo() {
        return titulo;
    }

    private int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean validarCampos() throws RunTimeException {

        if (codigo == null || codigo.trim().isEmpty()) { //objeto.metodo1().metodo2()
            System.out.println("codigo possue null ou vazio");
        }
        if (titulo == null || titulo.trim().isEmpty()) {
            System.out.println("titulo possue null ou vazio");
        }
        if (anoPublicacao < 1000 || anoPublicacao > 2024) {
            System.out.println("O ano esta entre 1000 e 2024");
        }

        return true;
    }

    @Override
    public String toString() {
        return "codigo: " + codigo + ", titulo: " + titulo + ", ano de publicação " + anoPublicacao;
    }
}







