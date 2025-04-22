/*package ejercicios;
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

        System.out.println("Porcentaje de descuento " + porcentajeDescuento + "%");
        scanner.close();
    }
} */
package ejercicios;
import java.util.Scanner;

public class Ejercicio17 {
   
    private double precioFinal, pvp;

    public void setDatos(double precioFinal1, double pvp1) {
        this.precioFinal = precioFinal1;
        this.pvp = pvp1;
    }
    public double getPorcentajeDescuento() {
        double descuento = pvp - precioFinal;
        return (descuento / pvp) * 100;
    }

    public void descuento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Precio final ");
        double finalPrecio = scanner.nextDouble();
        System.out.print("Precio de venta al público ");
        double precioPVP = scanner.nextDouble();
        scanner.close();
    
        setDatos(finalPrecio, precioPVP);

        System.out.println("Porcentaje de descuento " + getPorcentajeDescuento() + "%");
    }
}
