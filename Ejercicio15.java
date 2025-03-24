import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lectura anterior: ");
        double lecturaAnterior = scanner.nextDouble();
        System.out.print("Lectura actual: ");
        double lecturaActual = scanner.nextDouble();
        System.out.print("Costo por kilovatio: ");
        double costoKilovatio = scanner.nextDouble();

        double consumo = lecturaActual - lecturaAnterior;
        double monto = consumo * costoKilovatio;

        System.out.println("Monto a pagar: " + monto);
        scanner.close();
    }
}

