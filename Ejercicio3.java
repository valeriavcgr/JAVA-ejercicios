// Un vendedor recibe un sueldo base, más un 10% extra por comisiones de sus ventas. El vendedor  desea saber cuánto dinero obtendrá por concepto de comisiones por las tres ventas que realizó en  el mes y el total que recibirá tomando en cuenta su sueldo base y sus comisiones. 
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba su sueldo");
        double sueldo = scanner.nextDouble();
        System.out.print("Venta 1: ");
        double venta = scanner.nextDouble();
        System.out.print("Venta 2: ");
        double venta2 = scanner.nextDouble();
        System.out.print("Venta 3: ");
        double venta3 = scanner.nextDouble();
        double comisiones = (venta + venta2 + venta3) * 0.10; // 10% de comisiones
        double total = sueldo + comisiones;
        System.out.println("El valor de sus comisiones es " + comisiones);
        System.out.println("El total que recibe es  " + total);
        scanner.close();
    }
}

