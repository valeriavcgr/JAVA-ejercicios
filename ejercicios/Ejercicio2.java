package ejercicios;
// Suponga que un individuo decide invertir su capital en un banco y desea saber cuánto dinero ganará  después de un mes si el banco paga a razón de 2% mensual.
import java.util.Scanner;
public class Ejercicio2 {
    private double capital;
    public void setInvertir(double invertircapital) {
        this.capital = invertircapital;
    }
    public double getinvertir() {
        return capital * 0.02;
    }
    public void invertir(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("escriba su capital ");
        double capitalinvertir = scanner.nextDouble();
        scanner.close();
        setInvertir(capitalinvertir);
        System.out.println("Usted gana en el mes" + getinvertir());

    }
    }

