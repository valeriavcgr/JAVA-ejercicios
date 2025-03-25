import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados F ");
        double temperatura = scanner.nextDouble();
        String deporte;
        if (temperatura > 85) {
            deporte = "Natación";
        } else if (temperatura > 70 && temperatura <= 85) {
            deporte = "Tenis";
        } else if (temperatura > 32 && temperatura <= 70) {
            deporte = "Golf";
        } else if (temperatura > 10 && temperatura <= 32) {
            deporte = "Esquí";
        } else {
            deporte = "Marcha";
        }
        System.out.println("El deporte recomendado para " + temperatura + "°F es: " + deporte);

        scanner.close();
    }
}

