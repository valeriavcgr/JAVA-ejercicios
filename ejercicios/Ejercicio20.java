package ejercicios;
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
}
