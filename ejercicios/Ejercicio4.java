package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    private double totalCompra;
    public void setTotal(double totalCompra) {
        this.totalCompra = totalCompra;
    }
    public double getTotal() {
        return totalCompra * 1.5; 
    }
    public void compra() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el total de su compra ");
        double totalIngresado = scanner.nextDouble();
        scanner.close();
        setTotal(totalIngresado);
        System.out.println("El total a pagar con descuento es: " + getTotal());
    }
}
