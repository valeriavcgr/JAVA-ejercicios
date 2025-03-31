package ejercicioscondicionales;
import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en Bolívares: ");
        int cantidad = scanner.nextInt();
        int[] billetes = {50000, 20000, 10000, 5000, 2000, 1000, 500, 100, 50, 20, 10};
        for (int billete : billetes) {
            if (cantidad >= billete) {
                int bill = cantidad / billete; 
                cantidad %= billete; 
                System.out.println("Billetes de " + billete + " Bs " + bill);
            }
        }
        if (cantidad > 0) {
            System.out.println("Cantidad restante sin desglosar " + cantidad + " Bs");
        }

        scanner.close();
    }
}
