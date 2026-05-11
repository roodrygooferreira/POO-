package universidade.prova;

public class ProvaAV3UCB extends ProvaFinalUniversidade {

    public ProvaAV3UCB(ProvaUniversidade provaUniversidade) {
        super(provaUniversidade);
    }

    @Override
    public boolean habilitadoRealizarProva() {

        // Na UCB pode fazer AV3 mesmo aprovado
        return true;
    }
}