package TALLER12.EJERCICIO1;

public class Ave implements Volador, Cantante {
    @Override
    public void volar() {
        System.out.println("El ave está volando alto.");
    }

    @Override
    public void cantar() {
        System.out.println("El ave está cantando una melodía.");
    }
}