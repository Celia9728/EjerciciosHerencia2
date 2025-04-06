package Ejercicio6;

public class Vehiculo {

    protected String color;
    protected int ruedas;

    public Vehiculo(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        String mensaje;
        mensaje = "Color: " + this.color + "\n";
        mensaje += "ruedas: " + this.ruedas + "\n";
        return mensaje;
    }
}
