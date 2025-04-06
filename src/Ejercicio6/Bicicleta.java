package Ejercicio6;

public class Bicicleta extends Vehiculo {

    protected String tipo;

    static private final String[] listaTipos = {"urbana", "deportiva"};

    public Bicicleta(int ruedas, String tipo, String color) {
        super(color, ruedas);
        this.tipo = validarTipo(tipo);
    }

    @Override
    public String toString() {
        String mensaje;
        mensaje = super.toString();
        mensaje += "Tipo: " + this.tipo + "km/h \n";
        return mensaje;
    }

    // VALIDACIONES
    private String validarTipo(String tipo) {

        for (int i = 0; i < this.listaTipos.length; i++) {
            if (tipo.equals(this.listaTipos[i])) {
                return tipo;
            }
        }
        return "urbana";
    }

}
