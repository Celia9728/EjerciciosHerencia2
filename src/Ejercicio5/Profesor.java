package Ejercicio5;

public class Profesor {

    // ATRIBUTOS
    private String nombre;
    protected int horasTotalesAignaturas;
    protected boolean enClase;

    protected Asignatura[] listaAsignaturas;
    protected int numeroAsignaturasProfesor;

    // CONSTRUCTOR
    public Profesor(String nombre, int numeroAsignaturas) {
        this.nombre = nombre;
        listaAsignaturas = new Asignatura[numeroAsignaturas];
        this.crearAsignatura(listaAsignaturas.length);
        enClase = false;
    }

    // GETTERS
    public String getNombre() {
        return this.nombre;
    }

    public int getCantidadAsignaturas() {
        return this.numeroAsignaturasProfesor;
    }

    // METODOS PARA USAR FUERA
    public void empezarClase() {
        int asignatura;

        if (enClase) {
            System.out.println("No puede dar clase porque ya esta en una");
        } else {
            asignatura = (int) (Math.random() * numeroAsignaturasProfesor);
            System.out.println(this.nombre + " esta dando clase de " + this.listaAsignaturas[asignatura].getCodigo());
            enClase = true;
        }
    }

    public void pararClase() {
        if (!enClase) {
            System.out.println("El profesor no esta dando clase.");
        } else {
            System.out.println(this.nombre + " ha finalizado de dar clase.");
            enClase = false;
        }
    }

    public int contarHoras() {
        this.horasTotalesAignaturas = 0;
        for (int i = 0; i < this.numeroAsignaturasProfesor; i++) {
            this.horasTotalesAignaturas += listaAsignaturas[i].getNumeroHoras();
        }
        return this.horasTotalesAignaturas;
    }

    public void nuevaAsignatura() {
        for (int i = 0; i < this.listaAsignaturas.length; i++) {
            if (this.listaAsignaturas[i] == null) {
                this.listaAsignaturas[i] = new Asignatura(random(100, 200), random(3, 8));
                this.numeroAsignaturasProfesor++;
                contarHoras();
                return;

            }
        }
    }

    // METODO TOSTRING
    @Override
    public String toString() {
        String mensaje;
        mensaje = "Nombre: " + this.nombre + "\n";
        mensaje += "Horas totales: " + this.horasTotalesAignaturas + "\n";
        mensaje += "Esta en clase: " + this.enClase + "\n";
        mensaje += "Total de asignatura: " + this.numeroAsignaturasProfesor + "\n";

        return mensaje;
    }

    // METODOS PARA USAR SOLO DENTRO DE CLASE
    private void crearAsignatura(int longitud) {
        this.numeroAsignaturasProfesor = random(0, longitud);
        for (int i = 0; i < this.numeroAsignaturasProfesor; i++) {
            this.listaAsignaturas[i] = new Asignatura(random(100, 200), random(3, 8));
            this.horasTotalesAignaturas += listaAsignaturas[i].getNumeroHoras();
        }
    }

     public int random(int numero1, int numero2) {
        int random = numero1 + (int) (Math.random() * ( numero2 - numero1 + 1));
        return random;
    }
}
