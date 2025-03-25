import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio del automóvil y del terreno: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese el porcentaje de devaluación anual del automóvil: ");
        double auto = scanner.nextDouble() / 100;
        System.out.print("Ingrese el porcentaje de apreciación anual del terreno: ");
        double terreno = scanner.nextDouble() / 100;
        double precioAuto = precio * Math.pow((1 - auto), 3);
        double precioTerreno = precio * Math.pow((1 + terreno), 3);
        double perdidaAuto = precio - precioAuto;
        double gananciaTerreno = precioTerreno - precio;
        if (perdidaAuto <= (gananciaTerreno / 2)) {
            System.out.println("Le conviene comprar el automóvil.");
        } else {
            System.out.println("Le conviene comprar el terreno.");
        }
        System.out.println("Valor del automóvil después de 3 años: " + precioAuto);
        System.out.println("Valor del terreno después de 3 años: " + precioTerreno);
        System.out.println("Devaluación del automóvil: " + perdidaAuto);
        System.out.println("Incremento del valor del terreno: " + gananciaTerreno);

        scanner.close();
    }
}
