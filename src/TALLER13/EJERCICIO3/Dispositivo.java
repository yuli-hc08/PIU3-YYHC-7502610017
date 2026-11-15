package TALLER13.EJERCICIO3;

public abstract class Dispositivo {
    public abstract void encender();

    // No compila si le pongo default porque eso solo es valido en interfaces
    /*
    public default void apagar() {
        System.out.println("Apagando dispositivo...");
    }
    */
}