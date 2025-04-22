package ejercicios;
import java.util.Scanner;

public class Ejercicio14 {
   
    private double a, b, c, d, e, f;

    public void setValores(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Getter para calcular X
    public double getX() {
        double denominador = (a * e) - (b * d);
        return ((c * e) - (b * f)) / denominador;
    }

    public double getY() {
        double denominador = (a * e) - (b * d);
        return ((a * f) - (c * d)) / denominador;
    }

    public void calculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double va = scanner.nextDouble();
        System.out.print("b: ");
        double vb = scanner.nextDouble();
        System.out.print("c: ");
        double vc = scanner.nextDouble();
        System.out.print("d: ");
        double vd = scanner.nextDouble();
        System.out.print("e: ");
        double ve = scanner.nextDouble();
        System.out.print("f: ");
        double vf = scanner.nextDouble();
        scanner.close();

        setValores(va, vb, vc, vd, ve, vf);

        System.out.println("X: " + getX());
        System.out.println("Y: " + getY());
    }
}

