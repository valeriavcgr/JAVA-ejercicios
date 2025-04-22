/* package ejercicios;
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
}   */
package ejercicios;
import java.util.Scanner;

public class Ejercicio15 {
    // Variables privadas
    private double lectura1, lectura2, costo;

    // Setter para asignar los valores
    public void setDatos(double anterior, double actual, double costok) {
        this.lectura1 = anterior;
        this.lectura2 = actual;
        this.costo = costok;
    }

    public double getMonto() {
        double consumo = lectura2 - lectura1;
        return consumo * costo;
    }

    public void monto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lectura anterior  ");
        double anterior1 = scanner.nextDouble();
        System.out.print("Lectura actual ");
        double actual1 = scanner.nextDouble();
        System.out.print("Costo por kilovatio  ");
        double costo1 = scanner.nextDouble();
        scanner.close();

        setDatos(anterior1, actual1, costo1);
        System.out.println("Monto a pagar " + getMonto());
    }
}


