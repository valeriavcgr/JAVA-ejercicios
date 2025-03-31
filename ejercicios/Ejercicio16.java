package ejercicios;
import java.util.Scanner;

public class Ejercicio16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double largoLamina = 4.0;
        double anchoLamina = 1.5;
        double consumoPieza = 0.5;

        double areaLamina = largoLamina * anchoLamina;
        int cantidadPiezas = (int) (areaLamina / consumoPieza);
        double desperdicio = areaLamina % consumoPieza;

        System.out.println("Piezas fabricadas: " + cantidadPiezas);
        System.out.println("Desperdicio: " + desperdicio);
        scanner.close();
    }
}
