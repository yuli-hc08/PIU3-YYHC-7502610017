package TALLER11.EJERCICIO3;

public class Guitarra extends Instrumento {

    public Guitarra(String nombre) {
        super(nombre);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando acordes en la " + nombre + ".");
    }
}