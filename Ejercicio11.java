// Se conoce de un trabajador su nombre, el número de horas normales trabajadas, el pago de una hora  normal 
//y el número de horas extras trabajadas. Además, que, cada hora extra se paga 25% más del  valor de una hora normal.
// Si se deducen al trabajador sobre el sueldo base 5% del paro forzoso, 2%  de política habitacional y 7% para caja 
//de ahorro. Si se le asignan 25000 Bolívares por actualización  académica, 17300 Bolívares por cada hijo y una prima/
// por hogar de 18000 Bolívares. Calcule y  muestre las asignaciones, las deducciones y el sueldo neto del trabajador.


import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrse sus horas normales  ");
        double horas = scanner.nextDouble();
        System.out.print("ahora el pago por dada hora ");
        double pago= scanner.nextDouble();
        System.out.print("ingrese las horas extra ");
        double horase= scanner.nextDouble();
        System.out.print("ingrese numero de hijos ");
        int hijos = scanner.nextInt();

        double sueldo = horas * pago;
        double pagoe = horase * (pago * 1.25);
        double act = 25000;
        double asighijos = 17300 * hijos;
        double prima= 18000;
        double asig= act + asighijos + prima;

        double paro = sueldo * 0.05;
        double habit= sueldo * 0.02;
        double ahorro = sueldo * 0.07;
        double ded= paro + habit+ ahorro;

        double sueldon = sueldo+ pagoe + asig - ded;

        System.out.println("Las asignaciones son " + asig);
        System.out.println("Las deducciones son " + ded);
        System.out.println("el sueldo neto es " + sueldon);
        scanner.close();
    }
}
