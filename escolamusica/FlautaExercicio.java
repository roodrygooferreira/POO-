package ucb.estudo.escolamusica;

public class FlautaExercicio extends InstrumentoMusical {

    private String tipo;

    public FlautaExercicio(String nome, String material, String tipo) {
        super(nome, material);
        this.tipo = tipo;
    }

    @Override
    public void tocar() {
        System.out.println("Emitindo notas suaves na " + nome + " tipo " + tipo + "...");
        System.out.println("Fiuuu fiiiuuu!");
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Ajustando a posição e limpeza da flauta.");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Tipo: " + tipo);
    }

    public String getTipo() {
        return tipo;
    }
}