package Ejercicio5;

public class EjerciciosHerencia2 {

    public static void main(String[] args) {
        Profesor profe1 = new Profesor("Pepe", 5);
        System.out.println(profe1);

        profe1.empezarClase();
        System.out.println(profe1);

        profe1.pararClase();
        System.out.println(profe1);

        profe1.nuevaAsignatura();
        System.out.println(profe1);

        ProfesorUniversidad profeUni = new ProfesorUniversidad("Luis", 5, 20);

        profeUni.investigar();
        profeUni.empezarClase();

        profeUni.pararInvestigar();
        profeUni.empezarClase();

        System.out.println(profeUni);

        ProfesorUniversidad profeUni2 = new ProfesorUniversidad("Paco", 2, 20);
        profeUni2.empezarClase();
        profeUni2.empezarClase();
        profeUni2.investigar();
        profeUni2.pararInvestigar();

        Asignatura asignaturaNueva = new Asignatura(111, 30);

        System.out.println(profeUni2);

        profeUni2.abandonarAsignatura();
        System.out.println(profeUni2);

        profeUni2.cogerAsignatura(asignaturaNueva);
        System.out.println(profeUni2);
    }

}
