package universidade.prova;

public abstract class ProvaFinalUniversidade {

    protected double notaProvaFinal;
    protected double pesoProvaFinal;
    protected boolean realizouProva;

    protected ProvaUniversidade provaUniversidade;

    public ProvaFinalUniversidade(ProvaUniversidade provaUniversidade) {
        this.provaUniversidade = provaUniversidade;
    }

    public abstract boolean habilitadoRealizarProva();
}