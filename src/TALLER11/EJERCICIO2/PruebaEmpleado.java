package TALLER11.EJERCICIO2;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Laura Gómez", 3500000, 800000);
        Empleado vendedor = new Vendedor("Carlos Pérez", 1800000, 650000);

        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
    }
}