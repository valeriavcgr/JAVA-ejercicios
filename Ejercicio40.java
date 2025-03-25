import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la lectura anterior del medidor  ");
        int lecturaAnterior = scanner.nextInt();
        System.out.print("Ingrese la lectura actual del medidor  ");
        int lecturaActual = scanner.nextInt();
        int consumo = lecturaActual - lecturaAnterior;
        if (consumo < 0) {
            System.out.println("Error: La lectura actual no puede ser menor que la lectura anterior.");
            return;
        }
        double montoPagar = 0;
        if (consumo <= 100) {
            montoPagar = consumo * 2.622;
        } else if (consumo <= 300) {
            montoPagar = 100 * 2.622 + (consumo - 100) * 79.78;
        } else if (consumo <= 500) {
            montoPagar = 100 * 2.622 + 200 * 79.78 + (consumo - 300) * 89.52;
        } else {
            montoPagar = 100 * 2.622 + 200 * 79.78 + 200 * 89.52 + (consumo - 500) * 97.95;
        }
        System.out.println("\nResumen de Factura ");
        System.out.println("Consumo total  " + consumo + " Kwh");
        System.out.println("Monto a pagar por consumo eléctrico  " + montoPagar + " Bs.");

        scanner.close();
    }
}
