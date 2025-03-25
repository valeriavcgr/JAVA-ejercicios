//  Calcular el salario neto de un trabajador en función del número de horas trabajadas, el precio de la  hora y considerando un descuento fijo al sueldo base por concepto de impuestos del 20%. 
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese las horas trabajas ");
        double horas = scanner.nextDouble();
        System.out.print("ingrese el precio por hora");
        double precio = scanner.nextDouble();
        double salariob = horas * precio;
        double imp = salariob* 0.20; 
        double salario = salariob - imp;
        System.out.println("Su salario neto es " + salario);
        scanner.close();
    }
}

