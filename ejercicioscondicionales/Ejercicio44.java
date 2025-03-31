package ejercicioscondicionales;
import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el monto de la hipoteca ");
        double hipoteca = scanner.nextDouble();
        
        System.out.print("Ingrese el monto total de la inversión necesaria ");
        double inversionTotal = scanner.nextDouble();

        double inversionPersona, inversionSocio;
        if (hipoteca < 1000000) {
            inversionPersona = inversionTotal / 2;
            inversionSocio = inversionTotal / 2;
        } else {
            inversionPersona = hipoteca;
            double restante = inversionTotal - hipoteca;
            inversionSocio = restante / 2;
            inversionPersona += inversionSocio; 
        }
        System.out.println("Inversión de la persona " + inversionPersona);
        System.out.println("Inversión del socio  " + inversionSocio);
        
        scanner.close();
    }
}
