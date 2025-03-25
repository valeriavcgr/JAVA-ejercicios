import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el lado A: ");
        int A = scanner.nextInt();
        System.out.print("Ingrese el lado B: ");
        int B = scanner.nextInt();
        System.out.print("Ingrese el lado C: ");
        int C = scanner.nextInt();
        if ((A + B > C) && (A + C > B) && (B + C > A)) {
            System.out.println("Los lados forman un triángulo.");
            String tipo;
            if (A == B && B == C) {
                tipo = "Equilátero";
            } else if (A == B || A == C || B == C) {
                tipo = "Isósceles";
            } else {
                tipo = "Escaleno";
            }
            System.out.println("El triángulo es " + tipo);
            double S = (A + B + C) / 2.0;
            double area = Math.sqrt(S * (S - A) * (S - B) * (S - C));
            System.out.printf("El área del triángulo es  %.2f\n", area);
        } else {
            System.out.println("Los lados ingresados NO forman un triángulo.");
        }

        scanner.close();
    }
}
