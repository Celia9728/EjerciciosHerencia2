package Ejercicio6;

public class Motocicleta extends Bicicleta {

    protected int velocidad;
    protected int cilindrada;

    public Motocicleta(int ruedas, String tipo, String color, int velocidad, int cilindrada) {
        super(ruedas, tipo, color);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        String mensaje;
        mensaje = super.toString();
        mensaje += "Velocidad: " + this.velocidad + "km/h \n";
        mensaje += "Cilindrada: " + this.cilindrada + "cc \n";
        return mensaje;
    }

}
