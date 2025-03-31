package ejercicioscondicionales;
import java.util.Scanner;

public class Ejercicio32{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de P ");
        int P = scanner.nextInt();
        System.out.print("Ingrese el valor de Q ");
        int Q = scanner.nextInt();
        double exp = Math.pow(P, 3) + Math.pow(Q, 4) - 2 * Math.pow(P, 2);
        if (exp > 680) {
            System.out.println("Los valores de P y Q satisfacen la expresión.");
            System.out.println("P = " + P + ", Q = " + Q);
        } else {
            System.out.println("Los valores de P y Q NO satisfacen la expresión.");
        }

        scanner.close();
    }
}

