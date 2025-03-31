package ejercicioscondicionales;
import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el capital actual de la empresa ");
        double capital = scanner.nextDouble();
        double prestamo = 0;
        if (capital < 0) {
            prestamo = 10000 - capital;
            capital = 10000;
        } else if (capital > 0 && capital < 20000) {
            prestamo = 20000 - capital;
            capital = 20000;
        }
        double equipoComputo = 5000;
        double mobiliario = 2000;
        double restante = capital - (equipoComputo + mobiliario);
        double insumos = restante / 2;
        double incentivos = restante / 2;
        if (prestamo > 0) {
            System.out.println("Se solicitará un préstamo de " + prestamo);
        } else {
            System.out.println("No se requiere préstamo.");
        }
        System.out.println("Capital total después del préstamo " + capital);
        System.out.println("Presupuesto para equipo de cómputo " + equipoComputo);
        System.out.println("Presupuesto para mobiliario " + mobiliario);
        System.out.println("Presupuesto para compra de insumos " + insumos);
        System.out.println("Presupuesto para incentivos al personal " + incentivos);

        scanner.close();
    }
}
