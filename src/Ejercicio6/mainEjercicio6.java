package Ejercicio6;

import java.util.Scanner;

public class mainEjercicio6 {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        int usuario = consola.nextInt();
        int contador = 0;

        Vehiculo[] listaVehiculos = new Vehiculo[8];

        Coche coche1 = new Coche("Rojo", 4, 180, 1600);
        Coche coche2 = new Coche("Azul", 4, 220, 2000);
        listaVehiculos[0] = coche1;
        listaVehiculos[1] = coche2;

        Bicicleta bici1 = new Bicicleta(3, "deportiva", "Negro");
        Bicicleta bici2 = new Bicicleta(2, "montaña", "Verde");
        listaVehiculos[2] = bici1;
        listaVehiculos[3] = bici2;

        Camioneta camioneta1 = new Camioneta("Blanco", 4, 140, 2200, 1000);
        Camioneta camioneta2 = new Camioneta("Gris", 4, 160, 2500, 1500);
        listaVehiculos[4] = camioneta1;
        listaVehiculos[5] = camioneta2;

        Motocicleta moto1 = new Motocicleta(2, "deportiva", "Rojo", 180, 600);
        Motocicleta moto2 = new Motocicleta(4, "cross", "Negro", 150, 450);
        listaVehiculos[6] = moto1;
        listaVehiculos[7] = moto2;

        for (int i = 0; i < listaVehiculos.length; i++) {

            if (usuario == listaVehiculos[i].ruedas) {
                System.out.println(listaVehiculos[i]);
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("No habia ningun vehiculo con " + usuario + " ruedas");
        } else {
            System.out.println("Se han encontrado " + contador + " vehiculos con " + usuario + " ruedas.");

        }

    }

}
