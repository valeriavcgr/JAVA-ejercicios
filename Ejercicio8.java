// Calcule el área de un triángulo en función de las longitudes de sus lados, utilizando la fórmula:  √p(p¬a)(p-b)(p¬c) donde p = (a+b+c) / 2

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lado a: ");
        double a = scanner.nextDouble();
        System.out.print("Lado b: ");
        double b = scanner.nextDouble();
        System.out.print("Lado c: ");
        double c = scanner.nextDouble();
        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Área del triángulo: " + area);
        scanner.close();
    }
}
