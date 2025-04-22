/*package ejercicios;
import java.util.Scanner;

public class Ejercicio21{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Naranjas compradas ");
        double x = scanner.nextDouble();
        System.out.print("Precio por docena  ");
        double y = scanner.nextDouble();
        System.out.print("Ingreso total ");
        double k = scanner.nextDouble();

        double costoTotal = (x / 12) * y;
        double ganancia = k - costoTotal;
        double porcentajeGanancia = (ganancia / costoTotal) * 100;

        System.out.println("Porcentaje de ganancia: " + porcentajeGanancia + "%");
        scanner.close();
    }
} */
package ejercicios;
import java.util.Scanner;

public class Ejercicio21 {

    private double naranjas, precio, ingreso;


    public void setDatos(double x, double y, double k) {
        this.naranjas = x;
        this.precio = y;
        this.ingreso = k;
    }

    public double getPorcentajeGanancia() {
        double costoTotal = (naranjas / 12) * precio;
        double ganancia = ingreso - costoTotal;
        return (ganancia / costoTotal) * 100;
    }
    public void ganancia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Naranjas compradas  ");
        double x = scanner.nextDouble();
        System.out.print("Precio por docena  ");
        double y = scanner.nextDouble();
        System.out.print("Ingreso total  ");
        double k = scanner.nextDouble();
        scanner.close();

        setDatos(x, y, k);

        System.out.println("Porcentaje de ganancia " + getPorcentajeGanancia() + "%");
    }
}

