/*package ejercicios;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Préstamo (Bolívares X): ");
        double prestamo = scanner.nextDouble();
        System.out.print("Intereses pagados (Bolívares Y): ");
        double intereses = scanner.nextDouble();
        int tiempo = 4; // 4 años

        double razon = (intereses * 100) / (prestamo * tiempo);

        System.out.println("Porcentaje de interés anual: " + razon + "%");
        scanner.close();
    }
} */
package ejercicios;
import java.util.Scanner;

public class Ejercicio20 {
    private double prestamo, intereses;
    private final int tiempo = 4; 

    public void setDatos(double prestamo1, double intereses1) {
        this.prestamo = prestamo1;
        this.intereses = intereses1;
    }

    public double getInteresAnual() {
        return (intereses * 100) / (prestamo * tiempo);
    }

    public void interes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Préstamo  ");
        double valorPrestamo = scanner.nextDouble();
        System.out.print("Intereses pagados  ");
        double valorIntereses = scanner.nextDouble();
        scanner.close();

        setDatos(valorPrestamo, valorIntereses);

        System.out.println("Porcentaje de interés anual " + getInteresAnual() + "%");
    }
}

