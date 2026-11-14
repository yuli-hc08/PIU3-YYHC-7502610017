package TALLER11.EJERCICIO3;

public class PruebaErrorAbstracta {
    public static void main(String[] args) {
        // Error: no se puede instanciar una clase abstracta directamente
        /*
        Instrumento instrumento = new Instrumento("Piano");
        */

        Guitarra guitarra = new Guitarra("Guitarra acústica");
        guitarra.afinar();
        guitarra.tocar();
    }
}