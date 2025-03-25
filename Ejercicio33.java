import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre  ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la compra ");
        double compra = scanner.nextDouble();
        double descuento = 0; 
        if (compra >= 500 && compra <= 1000) {
            descuento = 0.05;
        } else if (compra > 1000 && compra <= 7000) {
            descuento = 0.11;
        } else if (compra > 7000 && compra <= 15000) {
            descuento = 0.18;
        } else if (compra > 15000) {
            descuento = 0.25;
        }
        double des = compra * descuento;
        double pagar = compra - des;
        System.out.println("Cliente " + nombre);
        System.out.println("Monto de la compra " + compra);
        System.out.println("Descuento aplicado " + des);
        System.out.println("Monto a pagar " + pagar);

        scanner.close();
    }
}

