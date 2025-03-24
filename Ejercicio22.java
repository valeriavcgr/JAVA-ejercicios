import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Precio al contado (P): ");
        double p = scanner.nextDouble();
        System.out.print("Cuota mensual (T): ");
        double t = scanner.nextDouble();
        int cuotas = 12;

        double costoTotalCuotas = t * cuotas;
        double recargo = costoTotalCuotas - p;
        double porcentajeRecargo = (recargo / p) * 100;

        System.out.println("Porcentaje de recargo: " + porcentajeRecargo + "%");
        scanner.close();
    }
}
