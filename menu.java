import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú ");
            System.out.println("1 para ejercicio1");
            System.out.println("2 para ejercicio2");
            System.out.println("3 para ejercicio3");
            System.out.println("4 para ejercicio4 ");
            System.out.println("5 para ejercicio5");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese tres edades: ");
                    double edad1 = scanner.nextDouble();
                    double edad2 = scanner.nextDouble();
                    double edad3 = scanner.nextDouble();
                    System.out.println("Promedio de edad: " + promedioEdad(edad1, edad2, edad3));
                    break;
                case 2:
                    System.out.print("Ingrese el capital: ");
                    double capital = scanner.nextDouble();
                    System.out.println("Interés mensual: " + interesMensual(capital));
                    break;
                case 3:
                    System.out.print("Ingrese sueldo base y tres ventas: ");
                    double sueldoBase = scanner.nextDouble();
                    double venta1 = scanner.nextDouble();
                    double venta2 = scanner.nextDouble();
                    double venta3 = scanner.nextDouble();
                    System.out.println("Sueldo total: " + sueldoTotal(sueldoBase, venta1, venta2, venta3));
                    break;
                case 4:
                    System.out.print("Ingrese el total de la compra: ");
                    double totalCompra = scanner.nextDouble();
                    System.out.println("Total con descuento: " + pagoConDescuento(totalCompra));
                    break;
                case 5:
                    System.out.print("Ingrese promedio de parciales, examen final y trabajo final: ");
                    double promedio = scanner.nextDouble();
                    double examenFinal = scanner.nextDouble();
                    double trabajoFinal = scanner.nextDouble();
                    System.out.println("Calificación final: " + calificacionFinal(promedio, examenFinal, trabajoFinal));
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    public static double promedioEdad(double edad1, double edad2, double edad3) {
        return (edad1 + edad2 + edad3) / 3;
    }

    public static double interesMensual(double capital) {
        return capital * 0.02;
    }

    public static double sueldoTotal(double sueldoBase, double venta1, double venta2, double venta3) {
        double comisiones = (venta1 + venta2 + venta3) * 0.10;
        return sueldoBase + comisiones;
    }

    public static double pagoConDescuento(double totalCompra) {
        return totalCompra * 0.85;
    }

    public static double calificacionFinal(double promedioParciales, double examenFinal, double trabajoFinal) {
        return (promedioParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);
    }
}



