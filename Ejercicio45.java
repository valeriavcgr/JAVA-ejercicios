import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese a ");
        double A = scanner.nextDouble();

        System.out.print("Ingrese el b ");
        double B = scanner.nextDouble();

        System.out.print("Ingrese c ");
        double C = scanner.nextDouble();
        double D = Math.pow(B, 2) - 4 * A * C;
        if (D > 0) {
            double X1 = (-B + Math.sqrt(D)) / (2 * A);
            double X2 = (-B - Math.sqrt(D)) / (2 * A);
            System.out.println("\nLas soluciones son reales y diferentes");
            System.out.println("X1 = " + X1);
            System.out.println("X2 = " + X2);
        } else if (D == 0) {
            double X = -B / (2 * A);
            System.out.println("\nLa ecuación tiene una única solución real");
            System.out.println("X = " + X);
        } else {
            System.out.println("\nNo tiene solución en los números reales.");
        }

        scanner.close();
    }
}
