import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Total de la compra: ");
        double compra = scanner.nextDouble();
        double descuento = compra * 0.15; // 15% de descuento
        double total = compra - descuento;
        System.out.println("Lo que debe pagar es " + total);
        scanner.close();
    }
}
