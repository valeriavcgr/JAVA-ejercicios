import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la distancia en km ");
        int km = scanner.nextInt();
        int costo = 5000; 
        if (km > 300 && km <= 1000) {
            costo += (km - 300) * 200;
        } else if (km > 1000) {
            costo += (700 * 200) + ((km - 1000) * 150);
        }
        System.out.println("El total a pagar es: " + costo + " Bolívares");
        scanner.close();
    }
}

