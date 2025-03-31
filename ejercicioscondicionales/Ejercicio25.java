package ejercicioscondicionales;
//Escriba un algoritmo, que dado como dato el sueldo de un trabajador, le aplique un aumento del
//15% si su sueldo es inferior a Bs. 40.000 y 12% en caso contrario. Imprima el nuevo sueldo del trabajador
import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su sueldo ");
        double sueldo = scanner.nextDouble();
        double sueldon;
        if (sueldo < 40000) {
            sueldon = sueldo * 1.15; 
        } else {
            sueldon = sueldo * 1.12; 
        }
        System.out.println("Su nuevo sueldo es  " + sueldon);
        scanner.close();
    }
}