abstract public class Barco  {
    protected String marca;
    protected String modelo;
    protected float capacCombustible;
    protected int capacCarga;
    public static int id;
    public int patente=0;

    public Barco(String marca, String modelo, float capacCombustible, int capacCarga) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacCombustible = capacCombustible;
        this.capacCarga = capacCarga;
        this.patente = ++id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getCapacCombustible() {
        return capacCombustible;
    }

    public void setCapacCombustible(float capacCombustible) {
        this.capacCombustible = capacCombustible;
    }

    public int getCapacCarga() {
        return capacCarga;
    }

    public void setCapacCarga(int capacCarga) {
        this.capacCarga = capacCarga;
    }


}
