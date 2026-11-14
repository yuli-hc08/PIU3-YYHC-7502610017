package TALLER11.EJERCICIO1;

public class PruebaFigura {
    public static void main(String[] args) {
        Figura circulo = new Circulo(4.0);
        Figura rectangulo = new Rectangulo(5.0, 3.0);

        circulo.mostrarArea();
        rectangulo.mostrarArea();
    }
}