package TALLER13.EJERCICIO3;

// Si quito el comentario de implements da error porque falta reproducir()
public class Televisor /* implements Reproductor */ {
    private String marca;

    public Televisor(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}