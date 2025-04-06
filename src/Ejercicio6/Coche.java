package Ejercicio6;

public class Coche extends Vehiculo {

    protected int velocidad;
    protected int cilindrada;

    public Coche(String color, int ruedas, int velocidad, int cilindrada) {
        super(color, ruedas);
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
