import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese su primera nota ");
        Double nota1 = scanner.nextDouble();
        System.out.print("ingrese su segunda nota ");
        double nota2 = scanner.nextDouble();
        System.out.print("ingrese su tercera nota: ");
        double nota3 = scanner.nextDouble();
        System.out.print("ingrese nota examen ");
        Double examen = scanner.nextDouble();
        System.out.print("ingrese nota del primer trabajo ");
        double trabajo = scanner.nextDouble();
        double promedioexamen = (nota1 + nota2 + nota3) / 3.0;
        double notafinal = (promedioexamen * 0.55) + (examen * 0.30) + (trabajo * 0.15);
        System.out.println("Su nota final es " + notafinal);
        scanner.close();
    }
}
