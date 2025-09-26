package hotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Habitacion[] habitaciones = {
            new HabitacionSencilla(101, 500.0, 1),
            new HabitacionDoble(202, 900.0, 2),
            new Suite(303, 2000.0, true, true)
        };

        int opcion;
        do {
            System.out.println("\n=== MENÚ HOTEL ===");
            System.out.println("1. Ver información de habitaciones");
            System.out.println("2. Reservar habitación");
            System.out.println("3. Liberar habitación");
            System.out.println("4. Calcular costo de estancia");
            System.out.println("5. Modificar precio de habitación");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Información de habitaciones ---");
                    for (Habitacion h : habitaciones) {
                        h.mostrarInfo();
                    }
                    break;

                case 2:
                    System.out.print("Número de habitación a reservar: ");
                    int numReserva = sc.nextInt();
                    Habitacion habReserva = buscarHabitacion(habitaciones, numReserva);
                    if (habReserva != null) {
                        habReserva.reservar();
                    } else {
                        System.out.println("Habitación no encontrada.");
                    }
                    break;

                case 3:
                    System.out.print("Número de habitación a liberar: ");
                    int numLiberar = sc.nextInt();
                    Habitacion habLiberar = buscarHabitacion(habitaciones, numLiberar);
                    if (habLiberar != null) {
                        habLiberar.liberar();
                    } else {
                        System.out.println("Habitación no encontrada.");
                    }
                    break;

                case 4:
                    System.out.print("Número de habitación: ");
                    int numCosto = sc.nextInt();
                    Habitacion habCosto = buscarHabitacion(habitaciones, numCosto);
                    if (habCosto != null) {
                        System.out.print("Cantidad de noches: ");
                        int noches = sc.nextInt();
                        System.out.println("Costo total: $" + habCosto.calcularCosto(noches));
                    } else {
                        System.out.println("Habitación no encontrada.");
                    }
                    break;

                case 5:
                    System.out.print("Número de habitación: ");
                    int numModificar = sc.nextInt();
                    Habitacion habModificar = buscarHabitacion(habitaciones, numModificar);
                    if (habModificar != null) {
                        System.out.print("Nuevo precio por noche: ");
                        double nuevoPrecio = sc.nextDouble();
                        habModificar.setPrecioPorNoche(nuevoPrecio);
                        System.out.println("Precio actualizado correctamente.");
                    } else {
                        System.out.println("Habitación no encontrada.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }

    public static Habitacion buscarHabitacion(Habitacion[] habitaciones, int numero) {
        for (Habitacion h : habitaciones) {
            if (h.getNumero() == numero) {
                return h;
            }
        }
        return null;
    }
}


