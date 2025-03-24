//  Resuelva el problema que tienen en una gasolinera. Los surtidores de la misma registran lo que  surten en galones, pero el precio de la gasolina está fijado en litros. Se requiere que calcule y muestre  lo que hay que cobrarle a un cliente, considerando que: (a) cada galón tiene 3.785 litros; (b) el precio  del litro es de 100 Bolívares.

import java.util.Scanner;

public class Ejercicio18{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Galones surtidos: ");
        double galones = scanner.nextDouble();
        double litrosPorGalon = 3.785;
        double precioLitro = 100;

        double litros = galones * litrosPorGalon;
        double cobro = litros * precioLitro;

        System.out.println("Cobro: " + cobro + " Bolívares");
        scanner.close();
    }
}
