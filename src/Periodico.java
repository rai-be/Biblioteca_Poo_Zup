import RunTimeException.RunTimeException;

public class Periodico extends ItemBibliografico {

    private Integer semanal;
    private Integer mensal;
    private Integer trimestral;

    public Periodico(int semanal, int mensal, int trimestral, String codigo, String titulo, int anoPublicacao) {
        super(codigo, titulo, anoPublicacao); // Chama o construtor da classe mãe ItemBibliografico
        this.semanal = semanal;
        this.mensal = mensal;
        this.trimestral = trimestral;
    }

    public int getSemanal() {
        return semanal;
    }

    public int getMensal() {
        return mensal;
    }

    public int getTrimestral() {
        return trimestral;
    }

    public boolean validarCampos() throws RunTimeException {
        if (semanal == null || semanal < 0) {
            throw new RunTimeException("Valor de semanal inválido");
        }
        if (mensal == null || mensal < 0) {
            throw new RunTimeException("Valor de mensal inválido");
        }
        if (trimestral == null || trimestral < 0) {
            throw new RunTimeException("Valor de trimestral inválido");
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + ", semanal = " + semanal + ", mensal = " + mensal + ", trimestral = " + trimestral;
    }
}



