/* 
public class Secuenciales {

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
        ejercicio11();
        
        
    }
    public static void ejercicio1() {
        double resultado = promedio(25, 30, 35);
        System.out.println("Promedio de edades " + resultado);
    }
    public static double promedio(double edad1, double edad2, double edad3) {
        return (edad1 + edad2 + edad3) / 3;
    }
    public static void ejercicio2() {
        double resultado = interes(1000);
        System.out.println("Interés mensual " + resultado);
    }
    public static double interes(double capital) {
        return capital * 0.02;
    }
    public static void ejercicio3() {
        double resultado = sueldo(1500, 200, 300, 400);
        System.out.println("Sueldo total " + resultado);
    }
    public static double sueldo(double sueldob, double venta1, double venta2, double venta3) {
        double comisiones = (venta1 + venta2 + venta3) * 0.10;
        return sueldob + comisiones;
    }
    public static void ejercicio4() {
        double resultado = des(500);
        System.out.println("Pago con descuento " + resultado);
    }
    public static double des(double totalCompra) {
        return totalCompra * 0.85;
    }
    public static void ejercicio5() {
        double resultado = calificacion(80, 90, 85);
        System.out.println("Calificación final: " + resultado);
    }
    public static double calificacion(double promedioex, double examen, double trabajo) {
        return (promedioex * 0.55) + (examen * 0.30) + (trabajo * 0.15);
    }
    public static void ejercicio6() {
        double resultadoHombres = porhom(20, 30);
        double resultadoMujeres = pormujer(20, 30);
        System.out.println("Porcentaje de hombres " + resultadoHombres + "%"+  " y el porcentaje de mujeres " + resultadoMujeres + "%" );
    }
    public static double porhom(int hombres, int mujeres) {
        return (hombres * 100.0) / (hombres + mujeres);
    }
    public static double pormujer(int hombres, int mujeres) {
        return (mujeres * 100.0) / (hombres + mujeres);
    }
    public static void ejercicio7() {
        double metros = 5; 
        double resultadopulgadas = pulgadas(metros);
        double resultadopies = pies(resultadopulgadas);
        System.out.println(metros + " metros equivalen a " + resultadopies + " pies y " + resultadopulgadas+ " pulgadas.");
    }
    public static double pulgadas(double metros) {
        return metros * 39.27;
    }
    public static double pies(double pulgadas) {
        return pulgadas / 12;
    }
    public static void ejercicio8() {
        double triangulo = area(3, 4, 5);
        System.out.println("Área del triángulo: " + triangulo);
    }

    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public static void ejercicio9() {
        double resultado = salario(40, 10);
        System.out.println("Salario neto " + resultado);
    }

    public static double salario(double horas, double precio) {
        double sueldo = horas * precio;
        double descuento = sueldo * 0.20;
        return sueldo - descuento;
    }
    public static void ejercicio10() {
        double chelines = 100;
        double pesetaschelines = convertirpesetasdesdechelines(chelines);
        System.out.println(chelines + " chelines austríacos equivalen a " + pesetaschelines + " pesetas");

        double dracmas = 100;
        double francosdesdedracmas = convertirfrancosdesderacmas(dracmas);
        System.out.println(dracmas + " dracmas griegos equivalen a " + francosdesdedracmas + " francos franceses.");

        double pesetas = 1000;
        double dolaresdesdepesetas = convertirdolaresdesdepesetas(pesetas);
        double lirasdesdepesetas = convertirlirasdesdepesetas(pesetas);
        System.out.println(pesetas + " pesetas equivalen a " + dolaresdesdepesetas + " dólares y " + lirasdesdepesetas + " liras italianas ");
    }

    public static double convertirpesetasdesdechelines(double chelines) {
        return (chelines * 956.871) / 100;
    }
    public static double convertirfrancosdesderacmas(double dracmas) {
        double pesetas = (dracmas * 88.607) / 100;
        return pesetas / 20.110;
    }
    public static double convertirdolaresdesdepesetas(double pesetas) {
        return pesetas / 122.499;
    }
    public static double convertirlirasdesdepesetas(double pesetas) {
        return (pesetas * 100) / 9.289;
    }
    public static void ejercicio11() {
        double sueldobase = calcularsueldobase(40, 50);
        double pagoextra = calcularpagohorasextras(10, 50);
        double asignaciones = calcularasignaciones(2);
        double deducciones = calculardeducciones(sueldobase);
        double sueldoneto = sueldobase + pagoextra + asignaciones - deducciones;
        System.out.println("Asignaciones  " + asignaciones+ "deducciones  " + deducciones + "sueldo neto  " + sueldoneto);
    }
    public static double calcularsueldobase(double horas, double pago) {
        return horas * pago;
    }
    public static double calcularpagohorasextras(double horasextras, double pago) {
        double pagoextra = pago * 1.25;
        return horasextras * pagoextra;
    }
    public static double calculardeducciones(double sueldobase) {
        double paro = sueldobase * 0.05;
        double politica = sueldobase * 0.02;
        double ahorro = sueldobase * 0.07;
        return paro + politica + ahorro;
    }
    public static double calcularasignaciones(int hijos) {
        double actualizacion = 25000;
        double asignacionhijos = hijos * 17300;
        double prima = 18000;
        return actualizacion + hijos + hogar;
    }
}   

*/


