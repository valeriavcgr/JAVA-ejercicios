import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la edad en meses o años (Ejemplo: 2 para 2 meses, 10 para 10 años): ");
        double edad = scanner.nextDouble();
        System.out.print("Ingrese el sexo (M para masculino, F para femenino, N si es menor de 15 años): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Ingrese el nivel de hemoglobina (g%): ");
        double hemoglobina = scanner.nextDouble();

        // Variables para los límites
        double min = 0, max = 0;

        // Determinar los valores de referencia según la edad y el sexo
        if (edad <= 1) { 
            min = 13; max = 26;
        } else if (edad <= 6) { 
            min = 10; max = 18;
        } else if (edad <= 12) { 
            min = 11; max = 15;
        } else if (edad <= 60) { // 5 años = 60 meses
            min = 11.5; max = 15;
        } else if (edad <= 120) { // 10 años = 120 meses
            min = 12.6; max = 15.5;
        } else if (edad <= 180) { // 15 años = 180 meses
            min = 13; max = 15.5;
        } else { // Mayores de 15 años
            if (sexo == 'F') {
                min = 12; max = 16;
            } else if (sexo == 'M') {
                min = 14; max = 18;
            } else {
                System.out.println("Sexo inválido para esta edad.");
                scanner.close();
                return;
            }
        }

        // Evaluar si la persona tiene anemia
        if (hemoglobina < min) {
            System.out.println("\nResultado: POSITIVO. La persona tiene ANEMIA.");
        } else {
            System.out.println("\nResultado: NEGATIVO. La persona NO tiene anemia.");
        }

        // Mostrar valores de referencia
        System.out.println("Valores normales para su edad y sexo: " + min + " - " + max + " g%.");

        scanner.close();
    }
}
