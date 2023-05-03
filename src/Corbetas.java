public class Corbetas extends Barco implements iPescar{

    private int cantJaulas;
    public static final int capJaulas = 10;

    public Corbetas(String marca, String modelo, float capacCombustible, int capacCarga, int cantJaulas) {
        super(marca, modelo, capacCombustible, capacCarga);
        this.cantJaulas = cantJaulas;
    }

    public int getCantJaulas() {
        return cantJaulas;
    }

    public void setCantJaulas(int cantJaulas) {
        this.cantJaulas = cantJaulas;
    }

    @Override
    public int recoleccion(int cantidadJaulas) {
        return cantidadJaulas*capJaulas;
    }

    @Override
    public int getMonto(int recolecc) {
        return recolecc * 11;
    }

    @Override
    public String toString() {
        return "Corbetas{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacCombustible=" + capacCombustible +
                ", capacCarga=" + capacCarga +
                ", patente=" + patente +
                '}';
    }
}
