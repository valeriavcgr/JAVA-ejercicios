package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    // Definimos las variables privadas para el sueldo y las ventas
    private double sueldo;
    private double venta1;
    private double venta2;
    private double venta3;
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public void setVentas(double venta1, double venta2, double venta3) {
        this.venta1 = venta1;
        this.venta2 = venta2;
        this.venta3 = venta3;
    }
    public double getComisiones() {
        return (venta1 + venta2 + venta3) * 0.10;
    }
    public double getTotal() {
        return sueldo + getComisiones();
    }
    public void sueldo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba su sueldo: ");
        double sueldoIngresado = scanner.nextDouble();
        System.out.print("Venta 1: ");
        double venta1Ingresada = scanner.nextDouble();
        System.out.print("Venta 2: ");
        double venta2Ingresada = scanner.nextDouble();
        System.out.print("Venta 3: ");
        double venta3Ingresada = scanner.nextDouble();
        scanner.close();
        setSueldo(sueldoIngresado);
        setVentas(venta1Ingresada, venta2Ingresada, venta3Ingresada);
        System.out.println("El valor de sus comisiones es: " + getComisiones());
        System.out.println("El total que recibe es: " + getTotal());
    }
}


