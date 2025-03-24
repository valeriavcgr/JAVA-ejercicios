import java.util.Scanner;

public class Ejercicio21{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Naranjas compradas (X): ");
        double x = scanner.nextDouble();
        System.out.print("Precio por docena (Bs. Y): ");
        double y = scanner.nextDouble();
        System.out.print("Ingreso total (Bs. K): ");
        double k = scanner.nextDouble();

        double costoTotal = (x / 12) * y;
        double ganancia = k - costoTotal;
        double porcentajeGanancia = (ganancia / costoTotal) * 100;

        System.out.println("Porcentaje de ganancia: " + porcentajeGanancia + "%");
        scanner.close();
    }
}
