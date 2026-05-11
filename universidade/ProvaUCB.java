package universidade.prova;

public class ProvaUCB extends ProvaUniversidade {

    public ProvaUCB(double av1, double av2, double av3) {
        super(av1, av2, av3);

        this.pesoAV1 = 1;
        this.pesoAV2 = 1;
        this.pesoAV3 = 1;

        this.mediaMinima = 7;
    }

    @Override
    public double calcularMedia() {

        double maior1 = av1;
        double maior2 = av2;

        if (av3 > maior1 || av3 > maior2) {

            if (av1 < av2) {
                maior1 = av2;
                maior2 = av3;
            } else {
                maior1 = av1;
                maior2 = av3;
            }
        }

        media = (maior1 + maior2) / 2;

        return media;
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {
        return new ProvaAV3UCB(this);
    }
}