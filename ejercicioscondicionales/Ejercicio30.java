package ejercicioscondicionales;
import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese a ");
        int A = scanner.nextInt();
        System.out.print("Ingrese b ");
        int B = scanner.nextInt();
        System.out.print("Ingrese c");
        int C = scanner.nextInt();
        System.out.print("Ingrese d ");
        int D = scanner.nextInt();
        int N = A * 1000 + B * 100 + C * 10 + D;
        System.out.println("El número es " + N);
        int centenas = (N / 100) * 100; 
        int siguienteCentena = centenas + 100; 
        int ultimoDigito = N % 100; 
        int redondeado = (ultimoDigito >= 50) ? siguienteCentena : centenas;
        System.out.println("Número redondeado a la centena más cercana: " + redondeado);
        scanner.close();
    }
}