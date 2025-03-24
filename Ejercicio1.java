// Obtener el promedio de edad de tres personas.
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("escriba la primera edad");
        int edad1 = scanner.nextInt();
        System.out.print("escriba la segunda edad ");
        int edad2 = scanner.nextInt();
        System.out.print("escriba la tercera edad ");
        int edad3 = scanner.nextInt();
        double promedio = (edad1 + edad2 + edad3) / 3.0;
        System.out.println("Promedio de edad: " + promedio);
        scanner.close();
    }
}
