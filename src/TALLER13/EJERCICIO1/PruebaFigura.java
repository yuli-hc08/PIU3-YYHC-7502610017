package TALLER13.EJERCICIO1;

public class PruebaFigura {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(6.0, 4.0);
        Figura triangulo = new Triangulo(5.0, 3.0);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}