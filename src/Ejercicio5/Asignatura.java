package Ejercicio5;

public class Asignatura {

    private int codigo;
    private int numeroHoras;

    public Asignatura(int codigo, int numeroHoras) {
        this.codigo = codigo;
        this.numeroHoras = numeroHoras;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public int getNumeroHoras() {
        return this.numeroHoras;
    }

    // METODO TOSTRING
    @Override
    public String toString() {
        String mensaje;
        mensaje = "-----------------------------------------\n";
        mensaje += "Numero de codigo: " + this.codigo + "\n";
        mensaje += "Numero de horas: " + this.numeroHoras + "\n";
        mensaje += "-----------------------------------------\n";
        return mensaje;
    }

}
