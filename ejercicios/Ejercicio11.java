package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
   
    private String nombre;
    private double horasNormales, pagoHora, horasExtras;
    private int numeroHijos;
    
    
    public void setDatos(String nombre, double horasNormales, double pagoHora, double horasExtras, int numeroHijos) {
        this.nombre = nombre;
        this.horasNormales = horasNormales;
        this.pagoHora = pagoHora;
        this.horasExtras = horasExtras;
        this.numeroHijos = numeroHijos;
    }
    
  
    public double getSueldoBase() {
        return horasNormales * pagoHora;
    }
    
    
    public double getPagoHorasExtras() {
        return horasExtras * (pagoHora * 1.25);
    }
    
    public double getDeducciones() {
        double sueldoBase = getSueldoBase();
        return (sueldoBase * 0.05) + (sueldoBase * 0.02) + (sueldoBase * 0.07);
    }
    
    // Getter para calcular las asignaciones
    public double getAsignaciones() {
        return 25000 + (17300 * numeroHijos) + 18000;
    }
    
    // Getter para calcular el sueldo neto
    public double getSueldoNeto() {
        return getSueldoBase() + getPagoHorasExtras() + getAsignaciones() - getDeducciones();
    }
    
    // Método para capturar los datos y ejecutar la lógica
    public void salariofinal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del trabajador: ");
        String nombreIngresado = scanner.nextLine();
        System.out.print("Ingrese el número de horas normales trabajadas: ");
        double horasNormalesIngresadas = scanner.nextDouble();
        System.out.print("Ingrese el pago por hora: ");
        double pagoHoraIngresado = scanner.nextDouble();
        System.out.print("Ingrese el número de horas extras trabajadas: ");
        double horasExtrasIngresadas = scanner.nextDouble();
        System.out.print("Ingrese el número de hijos: ");
        int numeroHijosIngresado = scanner.nextInt();
        scanner.close();
        
        // Asignamos los valores a través del setter
        setDatos(nombreIngresado, horasNormalesIngresadas, pagoHoraIngresado, horasExtrasIngresadas, numeroHijosIngresado);
        
        // Obtenemos y mostramos los resultados a través de los getters
        System.out.println("\nResumen de pago para " + nombre + ":");
        System.out.println("Sueldo base: " + getSueldoBase());
        System.out.println("Pago por horas extras: " + getPagoHorasExtras());
        System.out.println("Total asignaciones: " + getAsignaciones());
        System.out.println("Total deducciones: " + getDeducciones());
        System.out.println("Sueldo neto: " + getSueldoNeto());
    }
}
