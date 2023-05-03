import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random ram = new Random();

        int numeroR = ram.nextInt(0, 15) + 1;
        System.out.println("numeroR = " + numeroR);
        System.out.println();

        LanchasAmarillas lanchasAmarillas1 = new LanchasAmarillas("lal1", "2023", 150, 150);
        LanchasAmarillas lanchasAmarillas2 = new LanchasAmarillas("lal2", "2023", 150, 150);
        LanchasAmarillas lanchasAmarillas3 = new LanchasAmarillas("lala3", "2023", 150, 150);
        Corbetas corbetas1 = new Corbetas("marca1", "2020", 100, 130, 2);
        Corbetas corbetas2 = new Corbetas("marca2", "2021", 100, 130, 4);
        Corbetas corbetas3 = new Corbetas("marca3", "2022", 100, 130, 6);

        Puerto puerto = new Puerto();
        puerto.agregarBarquito(lanchasAmarillas1);
        puerto.agregarBarquito(lanchasAmarillas2);
        puerto.agregarBarquito(lanchasAmarillas3);
        puerto.agregarBarquito(corbetas1);
        puerto.agregarBarquito(corbetas2);
        puerto.agregarBarquito(corbetas3);

        puerto.listarBarcos(puerto.getBarcos());

        int trabajado = lanchasAmarillas1.recoleccion(13);
        int monto = lanchasAmarillas1.getMonto(trabajado);
        System.out.println("En " + trabajado + "kg" + " se genero " + monto + "$");

        trabajado = corbetas3.recoleccion(corbetas3.getCantJaulas());
        monto = corbetas3.getMonto(trabajado);
        System.out.println("En " + trabajado + "kg" + " se genero " + monto + "$");
    }
}