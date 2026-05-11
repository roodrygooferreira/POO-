package universidade.prova;

public class ProvaFinalFafifo extends ProvaFinalUniversidade {

    public ProvaFinalFafifo(ProvaUniversidade provaUniversidade) {
        super(provaUniversidade);
    }

    @Override
    public boolean habilitadoRealizarProva() {

        // Só faz AV3 se não atingiu média
        return !provaUniversidade.aprovado();
    }
}