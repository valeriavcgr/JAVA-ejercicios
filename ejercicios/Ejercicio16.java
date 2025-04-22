/*package ejercicios;
import java.util.Scanner;

public class Ejercicio16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double largoLamina = 4.0;
        double anchoLamina = 1.5;
        double consumoPieza = 0.5;

        double areaLamina = largoLamina * anchoLamina;
        int cantidadPiezas = (int) (areaLamina / consumoPieza);
        double desperdicio = areaLamina % consumoPieza;

        System.out.println("Piezas fabricadas: " + cantidadPiezas);
        System.out.println("Desperdicio: " + desperdicio);
        scanner.close();
    }
} */
package ejercicios;
import java.util.Scanner;

public class Ejercicio16 {

    private double largo, ancho, consumo;

    public void setDatos(double largol, double anchol, double consumol) {
        this.largo = largol;
        this.ancho = anchol;
        this.consumo = consumol;
    }

    public int getPiezas() {
        double area = largo * ancho;
        return (int)(area / consumo);
    }

    public double getDesperdicio() {
        double area = largo * ancho;
        return area % consumo;
    }


    public void lamina() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Largo de la lámina: ");
        double largo1 = scanner.nextDouble();
        System.out.print("Ancho de la lámina: ");
        double ancho1 = scanner.nextDouble();
        System.out.print("Consumo por pieza: ");
        double consumo1 = scanner.nextDouble();
        scanner.close();

        setDatos(largo1, ancho1, consumo1);


        System.out.println("Piezas fabricadas " + getPiezas());
        System.out.println("Desperdicio  " + getDesperdicio());
    }
}

