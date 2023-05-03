public class LanchasAmarillas extends Barco implements iPescar{

    public static final int KgHs= 20;
    public LanchasAmarillas(String marca, String modelo, float capacCombustible, int capacCarga) {
        super(marca, modelo, capacCombustible, capacCarga);
    }

    @Override
    public int recoleccion(int horasTrabajo) {
        return KgHs*horasTrabajo;
    }

    @Override
    public int getMonto(int recolecc) {
        return recolecc * 11;
    }

    @Override
    public String toString() {
        return "LanchasAmarillas{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacCombustible=" + capacCombustible +
                ", capacCarga=" + capacCarga +
                ", patente=" + patente +
                '}';
    }
}
