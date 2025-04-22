package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    private double mate, mate1, mate2, mate3, fisica, fisica1, fisica2, quimica, quimica1, quimica2, quimica3;
    
    public void setCalificaciones(double examenMatematica, double tareaMatematica1, double tareaMatematica2, double tareaMatematica3,
                                  double examenFisica, double tareaFisica1, double tareaFisica2,
                                  double examenQuimica, double tareaQuimica1, double tareaQuimica2, double tareaQuimica3) {
        this.mate = examenMatematica;
        this.mate1 = tareaMatematica1;
        this.mate2 = tareaMatematica2;
        this.mate3 = tareaMatematica3;
        this.fisica= examenFisica;
        this.fisica1 = tareaFisica1;
        this.fisica2 = tareaFisica2;
        this.quimica = examenQuimica;
        this.quimica1 = tareaQuimica1;
        this.quimica2 = tareaQuimica2;
        this.quimica3 = tareaQuimica3;
    }
    
    public double getMatematica() {
        double promedioTareas = (mate1 + mate2 + mate3) / 3;
        return (mate * 0.90) + (promedioTareas * 0.10);
    }
    
    public double getFisica() {
        double promedioTareas = (fisica1 + fisica2) / 2;
        return (fisica * 0.80) + (promedioTareas * 0.20);
    }
    
    public double getQuimica() {
        double promedioTareas = (quimica1 + quimica2 + quimica3) / 3;
        return (quimica * 0.85) + (promedioTareas * 0.15);
    }
    
    public double getPromedio() {
        return (getMatematica() + getFisica() + getQuimica()) / 3;
    }
    public void materia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la calificación del examen de Matemática: ");
        double examenMatematica = scanner.nextDouble();
        System.out.print("Ingrese las tres calificaciones de tareas de Matemática: ");
        double tareaMatematica1 = scanner.nextDouble();
        double tareaMatematica2 = scanner.nextDouble();
        double tareaMatematica3 = scanner.nextDouble();
        
        System.out.print("Ingrese la calificación del examen de Física: ");
        double examenFisica = scanner.nextDouble();
        System.out.print("Ingrese las dos calificaciones de tareas de Física: ");
        double tareaFisica1 = scanner.nextDouble();
        double tareaFisica2 = scanner.nextDouble();
        
        System.out.print("Ingrese la calificación del examen de Química: ");
        double examenQuimica = scanner.nextDouble();
        System.out.print("Ingrese las tres calificaciones de tareas de Química: ");
        double tareaQuimica1 = scanner.nextDouble();
        double tareaQuimica2 = scanner.nextDouble();
        double tareaQuimica3 = scanner.nextDouble();
        scanner.close();
        setCalificaciones(examenMatematica, tareaMatematica1, tareaMatematica2, tareaMatematica3,
                          examenFisica, tareaFisica1, tareaFisica2,
                          examenQuimica, tareaQuimica1, tareaQuimica2, tareaQuimica3);
        System.out.println("Promedio de Matemática  " + getMatematica());
        System.out.println("Promedio de Física  " + getFisica());
        System.out.println("Promedio de Química  " + getQuimica());
        System.out.println("Promedio General  " + getPromedio());
    }
}

