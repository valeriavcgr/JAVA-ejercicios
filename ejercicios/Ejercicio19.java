package ejercicios;
import java.util.Scanner;

public class Ejercicio19  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Presupuesto anual: ");
        double presupuesto = scanner.nextDouble();

        double ginecologia = presupuesto * 0.40;
        double traumatologia = presupuesto * 0.30;
        double pediatria = presupuesto * 0.30;

        System.out.println("Ginecología: " + ginecologia);
        System.out.println("Traumatología: " + traumatologia);
        System.out.println("Pediatría: " + pediatria);
        scanner.close();
    }
}
