package TALLER12.EJERCICIO3;

// Si quito el comentario de implements da error porque falta conducir()
public class VehiculoSinMotor /* implements Conductor */ {
    private String tipo;

    public VehiculoSinMotor(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}