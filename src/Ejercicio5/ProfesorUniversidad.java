package Ejercicio5;

public class ProfesorUniversidad extends Profesor {

    // ATRIBUTOS
    boolean puedeInvestigar;
    int numeroHorasInvestigar;

    boolean estaInvestigando;

    // CONSTRUCTOR
    public ProfesorUniversidad(
            String nombre,
            int numeroAsignaturas,
            int numeroHorasInvestigar) {
        super(nombre, numeroAsignaturas);
        puedeInvestigar(numeroHorasInvestigar);
    }

    // METODOS PARA USAR FUERA
    public void investigar() {
        if (!puedeInvestigar) {
            System.out.println(super.getNombre() + " no puede investigar ya que le faltan número de horas de clase”. ");
            return;
        }
        if (enClase) {
            System.out.println("No puede investigar porque esta dando clase.");
            return;
        }
        if (estaInvestigando) {
            System.out.println(super.getNombre() + " no puede porque ya esta investigando");
        } else {
            System.out.println(super.getNombre() + " está investigando");
            estaInvestigando = true;
        }
    }

    public void pararInvestigar() {
        if (!puedeInvestigar) {
            System.out.println(super.getNombre() + " no puede investigar ya que le faltan número de horas de clase”. ");
            return;
        }

        if (!estaInvestigando) {
            System.out.println("No esta investigando");
        } else {
            System.out.println(super.getNombre() + " ha parado de investigar.");
            estaInvestigando = false;
        }
    }

    @Override
    public void empezarClase() {
        if (estaInvestigando) {
            System.out.println("No puede dar clase porque esta investigando.");
        } else {
            super.empezarClase();
        }
    }

    public void cogerAsignatura(Asignatura nueva) {
        if (super.horasTotalesAignaturas + nueva.getNumeroHoras() > 25) {
            System.out.println("No puede añadirse porque supera el numero de horas");
            return;
        }

        for (int i = 0; i < this.listaAsignaturas.length; i++) {
            if (this.listaAsignaturas[i] == null) {
                this.listaAsignaturas[i] = nueva;
                super.cantidadAsignaturas++;
                super.contarHoras();
                this.puedeInvestigar(20);
                return;
            }
        }
    }

    public void abandonarAsignatura() {
        for (int i = super.listaAsignaturas.length - 1; i >= 0; i--) {
            if (super.listaAsignaturas[i] != null) {
                super.listaAsignaturas[i] = null;
                super.cantidadAsignaturas--;
                super.contarHoras();
                this.puedeInvestigar(20);
                return;
            }
        }
        System.out.println("No se pudo eliminar asignaturas porque no habia");
    }

    // METODO TOSTRING
    @Override
    public String toString() {
        String mensaje;
        mensaje = super.toString();
        if (super.cantidadAsignaturas > 0) {
            for (int i = 0; i < super.cantidadAsignaturas; i++) {
                mensaje += super.listaAsignaturas[i].toString();
            }
        }
        mensaje += "Numero de horas de investigacion: " + this.numeroHorasInvestigar + "\n";
        mensaje += "Dando clase: " + this.enClase + "\n";
        mensaje += "Esta investigando: " + this.estaInvestigando + "\n";
        return mensaje;
    }

    // METODOS PARA USAR SOLO DENTRO DE LA CLASE
    private void puedeInvestigar(int numeroHorasInvestigar) {
        if (super.horasTotalesAignaturas >= 8) {
            this.puedeInvestigar = true;
            this.numeroHorasInvestigar = numeroHorasInvestigar;
        } else {
            this.puedeInvestigar = false;
            this.numeroHorasInvestigar = 0;
        }
    }
}
