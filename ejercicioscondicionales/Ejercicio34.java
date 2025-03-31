package ejercicioscondicionales;
import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la categoría del trabajador (1-4) ");
        int categoria = scanner.nextInt();
        System.out.print("Ingrese el sueldo actual del trabajador ");
        double sueldo = scanner.nextDouble();
        double aumento = 0; 
        switch (categoria) {
            case 1:
                aumento = 0.15;
                break;
            case 2:
                aumento = 0.10;
                break;
            case 3:
                aumento = 0.08;
                break;
            case 4:
                aumento = 0.07;
                break;
            default:
                System.out.println("Categoría inválida. Debe ser un número entre 1 y 4.");
                scanner.close();
                return;
        }
        double sueldon = sueldo * aumento;
        double sueldonuevo = sueldo + sueldon;
        System.out.println("Categoría del trabajador " + categoria);
        System.out.println("Sueldo actual " + sueldo);
        System.out.println("Aumento aplicado " + sueldon);
        System.out.println("Nuevo sueldo " + sueldonuevo);

        scanner.close();
    }
}
