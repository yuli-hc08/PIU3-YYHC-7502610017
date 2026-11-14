package TALLER11.EJERCICIO3;

public abstract class Instrumento {
    protected String nombre;

    public Instrumento(String nombre) {
        this.nombre = nombre;
    }

    public abstract void tocar();

    // Si lo dejo concreto, las subclases no estan obligadas a sobrescribirlo
    public void afinar() {
        System.out.println("Afinando el instrumento de forma general...");
    }
}