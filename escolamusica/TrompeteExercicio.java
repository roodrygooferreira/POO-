package ucb.estudo.escolamusica;

public class TrompeteExercicio extends InstrumentoMusical {

    private String tonalidade;

    public TrompeteExercicio(String nome, String material, String tonalidade) {
        super(nome, material);
        this.tonalidade = tonalidade;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando sons brilhantes no " + nome + " em tonalidade " + tonalidade + "...");
        System.out.println("Tã tã rããã!");
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Ajustando os pistões e a pressão do ar do trompete.");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Tonalidade: " + tonalidade);
    }

    public String getTonalidade() {
        return tonalidade;
    }
}
