import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        System.out.print("d: ");
        double d = scanner.nextDouble();
        System.out.print("e: ");
        double e = scanner.nextDouble();
        System.out.print("f: ");
        double f = scanner.nextDouble();

        double denominador = (a * e) - (b * d);
        double x = ((c * e) - (b * f)) / denominador;
        double y = ((a * f) - (c * d)) / denominador;

        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        scanner.close();
    }
}

