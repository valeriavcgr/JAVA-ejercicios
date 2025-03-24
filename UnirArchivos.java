public class UnirArchivos {

    // Ejercicio 1: Promedio de edad de tres personas
    public static double promedioEdad(double edad1, double edad2, double edad3) {
        return (edad1 + edad2 + edad3) / 3;
    }

    // Ejercicio 2: Interés mensual de un capital
    public static double interesMensual(double capital) {
        return capital * 0.02;
    }

    // Ejercicio 3: Sueldo total con comisiones
    public static double sueldoTotal(double sueldoBase, double venta1, double venta2, double venta3) {
        double comisiones = (venta1 + venta2 + venta3) * 0.10;
        return sueldoBase + comisiones;
    }

    // Ejercicio 4: Pago con descuento en tienda
    public static double pagoConDescuento(double totalCompra) {
        return totalCompra * 0.85;
    }

    // Ejercicio 5: Calificación final de un estudiante
    public static double calificacionFinal(double promedioParciales, double examenFinal, double trabajoFinal) {
        return (promedioParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);
    }

    // Ejercicio 6: Porcentaje de hombres y mujeres en un grupo
    public static double[] porcentajeGenero(int hombres, int mujeres) {
        int total = hombres + mujeres;
        double porcentajeHombres = (hombres * 100.0) / total;
        double porcentajeMujeres = (mujeres * 100.0) / total;
        return new double[]{porcentajeHombres, porcentajeMujeres};
    }

    // Ejercicio 7: Conversión de metros a pies y pulgadas
    public static double[] convertirMetros(double metros) {
        double pulgadas = metros * 39.27;
        double pies = pulgadas / 12;
        return new double[]{pies, pulgadas};
    }

    // Ejercicio 8: Área de un triángulo usando fórmula de Herón
    public static double areaTriangulo(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    // Ejercicio 9: Salario neto de un trabajador
    public static double salarioNeto(double horasTrabajadas, double pagoPorHora) {
        double salarioBruto = horasTrabajadas * pagoPorHora;
        double salarioNeto = salarioBruto * 0.8; // Descuento del 20%
        return salarioNeto;
    }

    // Ejercicio 10: Conversión de chelines a pesetas
    public static double convertirChelinesAPesetas(double chelines) {
        return (chelines * 956.871) / 100;
    }

    // Ejercicio 10: Conversión de dracmas a francos franceses
    public static double convertirDracmasAFrancos(double dracmas) {
        return (dracmas * 88.607) / 100 / 20.110;
    }

    // Ejercicio 11: Sueldo neto con deducciones y asignaciones
    public static double sueldoNeto(double sueldoBase, double horasExtras, int numHijos) {
        double pagoHoraExtra = (sueldoBase / 40) * 1.25 * horasExtras;
        double asignaciones = 25000 + (numHijos * 17300) + 18000;
        double deducciones = sueldoBase * 0.14; // Paro forzoso (5%), Habitacional (2%), Caja de ahorro (7%)
        return sueldoBase + pagoHoraExtra + asignaciones - deducciones;
    }

    // Ejercicio 12: Promedio general de tres materias
    public static double promedioGeneral(double promedioMatematicas, double promedioFisica, double promedioQuimica) {
        return (promedioMatematicas + promedioFisica + promedioQuimica) / 3;
    }

    // Ejercicio 13: Dinero en un banco con billetes diferentes
    public static double dineroEnBanco(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        return n1 * 50000 + n2 * 20000 + n3 * 10000 + n4 * 5000 + n5 * 2000 + n6 * 1000 + n7 * 500 + n8 * 100;
    }

    // Ejercicio 14: Sistema de ecuaciones lineales
    public static double[] resolverEcuaciones(double a, double b, double c, double d, double e, double f) {
        double denominador = (a * e) - (b * d);
        if (denominador == 0) return null; // No tiene solución
        double x = (c * e - b * f) / denominador;
        double y = (a * f - c * d) / denominador;
        return new double[]{x, y};
    }

    // Ejercicio 15: Monto a pagar por consumo eléctrico
    public static double montoLuz(double lecturaAnterior, double lecturaActual, double costoKw) {
        double consumo = lecturaActual - lecturaAnterior;
        return consumo * costoKw;
    }

    // Ejercicio 16: Piezas que se fabrican con una lámina de hierro
    public static double[] fabricarPiezas(double largo, double ancho, double consumoPorPieza) {
        double areaLamina = largo * ancho;
        int piezasFabricadas = (int)(areaLamina / consumoPorPieza);
        double desperdicio = areaLamina - (piezasFabricadas * consumoPorPieza);
        return new double[]{piezasFabricadas, desperdicio};
    }

    // Ejercicio 17: Porcentaje de descuento aplicado
    public static double porcentajeDescuento(double precioFinal, double pvp) {
        return ((pvp - precioFinal) / pvp) * 100;
    }

    // Ejercicio 18: Cantidad de litros de leche sobrantes
    public static double lecheSobrante(double litrosProducidos, double litrosConsumidos) {
        return litrosProducidos - litrosConsumidos;
    }

    // Ejercicio 19: Edad en meses, días, horas y minutos
    public static int[] calcularEdad(int edadAnios) {
        int meses = edadAnios * 12;
        int dias = edadAnios * 365;
        int horas = dias * 24;
        int minutos = horas * 60;
        return new int[]{meses, dias, horas, minutos};
    }

    // Ejercicio 20: Conversión de dólares a euros
    public static double convertirDolaresAEuros(double dolares, double tasaCambio) {
        return dolares * tasaCambio;
    }

    // Ejercicio 21: Conversión de centímetros a pulgadas
    public static double convertirCmAPulgadas(double cm) {
        return cm / 2.54;
    }

    // Ejercicio 22: Conversión de kilogramos a libras
    public static double convertirKgALibras(double kg) {
        return kg * 2.20462;
    }

    // Ejercicio 23: Conversión de litros a galones
    public static double convertirLitrosAGalones(double litros) {
        return litros * 0.264172;
    }
}
