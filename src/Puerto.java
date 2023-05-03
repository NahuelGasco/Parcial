import java.util.ArrayList;

public class Puerto {

    private ArrayList<Barco> barcos;

    public Puerto() {
        this.barcos = new ArrayList<>();
    }

    public ArrayList<Barco> getBarcos() {
        return barcos;
    }

    public void setBarcos(ArrayList<Barco> barcos) {
        this.barcos = barcos;
    }

    public void agregarBarquito(Barco barquito){
        barcos.add(barquito);
    }
    public void listarBarcos(ArrayList barcos){
        int i;
        for(i=0; i< barcos.size(); i++){
            System.out.println(barcos.get(i).toString());
        }
    }



}
