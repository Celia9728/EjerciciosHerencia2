package Ejercicio5;

public class Profesor {

    private String nombre;
    protected Asignatura[] asignaturasListas;
    protected int horasTotales;
    protected boolean enClase;
    private int cantidadAsignaturas;

    public Profesor(String nombre, int numeroAsignaturas) {
        this.nombre = nombre;
        asignaturasListas = new Asignatura[numeroAsignaturas];
        this.crearAsignatura(asignaturasListas.length);
        enClase = false;
    }

    public void empezarClase() {
        int asignatura;

        if (enClase) {
            System.out.println("No puede dar clase porque ya esta en una");
        } else {
            asignatura = (int) Math.random() * cantidadAsignaturas;
            System.out.println(this.nombre + " esta dando clase de " + this.asignaturasListas[asignatura].getCodigo());
        }
    }
    
//    public void pararClase() {
//        if (empezarClase()) {
//            
//        }
//    }
//    

    private void crearAsignatura(int longitud) {
        longitud = random(0, asignaturasListas.length - 1);
        cantidadAsignaturas = longitud;
        Asignatura a;
        for (int i = 0; i < longitud; i++) {
            a = new Asignatura(random(100, 200), random(3, 8));
            this.asignaturasListas[i] = a;
            this.horasTotales += a.getNumeroHoras();
        }
    }

    public int random(int numero1, int numero2) {
        int random = numero1 + (int) (Math.random() * numero2) + 1;
        return random;
    }

}
