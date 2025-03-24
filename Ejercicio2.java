// Suponga que un individuo decide invertir su capital en un banco y desea saber cuánto dinero ganará  después de un mes si el banco paga a razón de 2% mensual.
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("escriba su capital ");
        double plata = scanner.nextDouble();
        double ganancia = plata * 0.02; // 2% mesual 
        System.out.println("Usted gana en el mes" + ganancia);
        scanner.close();
    }
}
