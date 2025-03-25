// Una empresa que comercializa cosméticos tiene organizados a sus vendedores en tres
//departamentos y ha establecido un programa de incentivos para incrementar su productividad. El
//gerente, al final del mes, pide el importe global de las ventas de los tres departamentos y aquellos
//que excedan el 33% de las ventas totales se les paga una cantidad extra equivalente al 20% de su
//salario mensual. Si todos los vendedores ganan lo mismo, determinar cuánto recibirán los
//vendedores de los tres departamentos al finalizar el mes.
import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese las ventas del Departamento 1 ");
        double ven1 = scanner.nextDouble();
        System.out.print("Ingrese las ventas del Departamento 2 ");
        double ven2 = scanner.nextDouble();
        System.out.print("Ingrese las ventas del Departamento 3 ");
        double ven3 = scanner.nextDouble();
        System.out.print("Ingrese el salario mensual  ");
        double salario = scanner.nextDouble();
        double ventas = ven1 + ven2 + ven3;
        double extra = ventas * 0.33;
        double dep1 = salario + (ven1 > extra ? salario * 0.20 : 0);
        double dep2 = salario + (ven2 > extra ? salario * 0.20 : 0);
        double dep3 = salario + (ven3 > extra ? salario * 0.20 : 0);
        System.out.println("Salario final ");
        System.out.println("Departamento 1 " + dep1);
        System.out.println("Departamento 2 " + dep2);
        System.out.println("Departamento 3 " + dep3);

        scanner.close();
    }
}
