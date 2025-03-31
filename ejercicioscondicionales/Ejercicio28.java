package ejercicioscondicionales;
//Una empresa quiere hacer una compra de varias piezas de la misma clase a un fabricante de
//refacciones. La empresa dependiendo del monto total de la compra, decidirá qué hacer para pagar
//al fabricante. Si el monto total de la compra excede de $500000 la empresa tendrá la capacidad
//de invertir de su propio dinero un 55% del monto de la compra, pedir presta al banco un 30% y el
//resto lo pagará solicitando un crédito al fabricante. Si el monto total de la compra no excede de
//$500000 la empresa tendrá capacidad de invertir de su propio dinero un 70% y el restante 30% lo
//pagará solicitando crédito al fabricante. El fabricante cobra por concepto de intereses un 20%
//sobre la cantidad que se le pague a crédito. Calcule y muestre la cantidad a invertir de los fondos
//de la empresa, la cantidad a pagar a crédito, el monto a pagar por intereses y si es necesario, la
//cantidad prestada al banco. 
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el total de la compra ");
        double compra = scanner.nextDouble();
        double inver, credito, inte, prestamo = 0;

        // Determinar la forma de pago según el monto de la compra
        if (compra > 500000) {
            inver = compra * 0.55;
            prestamo= compra * 0.30;
            credito= compra * 0.15;
        } else {
            inver = compra * 0.70;
            credito = compra * 0.30;
        }
        inte = credito * 0.20;
        System.out.println("compra ");
        System.out.println("Inversión de la empresa" + inver);
        System.out.println("Cantidad a pagar a crédito " + credito);
        System.out.println("Monto por intereses: $" + inte);

        if (compra > 500000) {
            System.out.println("Préstamo solicitado al banco " + prestamo);
        }
        scanner.close();
    }
}
