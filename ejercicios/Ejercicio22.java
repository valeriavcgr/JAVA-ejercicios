/*package ejercicios;
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
} */
package ejercicios;
import java.util.Scanner;

public class Ejercicio22 {
    private double precioContado, cuotaMensual;
    private final int cuotas = 12;

    public void setDatos(double p, double t) {
        this.precioContado = p;
        this.cuotaMensual = t;
    }
    public double getPorcentajeRecargo() {
        double costoTotalCuotas = cuotaMensual * cuotas;
        double recargo = costoTotalCuotas - precioContado;
        return (recargo / precioContado) * 100;
    }
    public void recargo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Precio al contado  ");
        double p = scanner.nextDouble();
        System.out.print("Cuota mensual  ");
        double t = scanner.nextDouble();
        scanner.close();

        setDatos(p, t);

        System.out.println("Porcentaje de recargo " + getPorcentajeRecargo() + "%");
    }
}
