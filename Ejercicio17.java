import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Precio final: ");
        double precioFinal = scanner.nextDouble();
        System.out.print("Precio de venta al público (PVP): ");
        double pvp = scanner.nextDouble();

        double descuento = pvp - precioFinal;
        double porcentajeDescuento = (descuento / pvp) * 100;

        System.out.println("Porcentaje de descuento: " + porcentajeDescuento + "%");
        scanner.close();
    }
}
