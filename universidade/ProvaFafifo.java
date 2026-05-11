package universidade.prova;

public class ProvaFafifo extends ProvaUniversidade {

    public ProvaFafifo(double av1, double av2, double av3) {
        super(av1, av2, av3);

        this.pesoAV1 = 1;
        this.pesoAV2 = 1;
        this.pesoAV3 = 3;

        this.mediaMinima = 6;
    }

    @Override
    public double calcularMedia() {

        media = ((av1 * pesoAV1) +
                 (av2 * pesoAV2) +
                 (av3 * pesoAV3))
                 / (pesoAV1 + pesoAV2 + pesoAV3);

        return media;
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {
        return new ProvaFinalFafifo(this);
    }
}