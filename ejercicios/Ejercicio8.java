package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    private double A, B, C;
    public void setLados(double ladoA, double ladoB, double ladoC) {
        this.A = ladoA;
        this.B = ladoB;
        this.C = ladoC;
    }
    

    public double getPerimetro() {
        return (A + B + C) / 2;
    }
    public double getArea() {
        double p = getPerimetro();
        return Math.sqrt(p * (p - A) * (p - B) * (p - C));
    }
    public void triangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la longitud del lado A  ");
        double ladoA1 = scanner.nextDouble();
        System.out.print("Ingrese la longitud del lado B  ");
        double ladoB2 = scanner.nextDouble();
        System.out.print("Ingrese la longitud del lado C  ");
        double ladoC3= scanner.nextDouble();
        scanner.close();
        setLados(ladoA1, ladoB2, ladoC3);
        System.out.println("El área del triángulo es  " + getArea());
    }
}
