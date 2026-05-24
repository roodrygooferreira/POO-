package ucb.estudo.escolamusica;

public class ViolinoExercicio extends InstrumentoMusical {

    private int numeroCordas;

    public ViolinoExercicio(String nome, String material, int numeroCordas) {
        super(nome, material);
        this.numeroCordas = numeroCordas;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando uma melodia clássica no " + nome + "...");
        System.out.println("♫ Violino emocionante tocando ♫");
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Ajustando as cordas e o arco do violino.");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Número de cordas: " + numeroCordas);
    }

    public int getNumeroCordas() {
        return numeroCordas;
    }
}