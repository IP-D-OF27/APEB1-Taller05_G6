
import java.util.Scanner;

/**
 * Ejercicio 12: "Cálculo de impuestos: Desarrollar una solución que permita
 * leer los datos de un automóvil (marca, origen y costo) 
 * imprima el impuesto por pagar y el precio de venta (incluido el impuesto).
 * Si el origen es Alemania el impuesto es 20% , si es de Japón el impuesto
 * es 30% , si es de Italia, 15% , y si es de USA, 8%"
 * @author Noelia, Sofia
 * @version 1.0
 */

public class Ejercicio12_CalculoDeImpuestos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese la marca, origen y costo: ");
        String marca = tcl.next();
        String origen = tcl.next();
        double costo = tcl.nextDouble();
        double impuesto = 0;
        double precioVenta;
        switch (origen) {
            case "Alemania":
                impuesto = costo * 0.20;
                break;
            case "Japon":
                impuesto = costo * 0.30;
                break;
            case "Italia":
                impuesto = costo * 0.15;
                break;
            case "USA":
                impuesto = costo * 0.08;
                break;
            default:
                System.out.println("Origen no valido");
                break;
        } 
        precioVenta = costo + impuesto;
        System.out.println("El impuesto a pagar es: " + impuesto);
        System.out.println("El precio de venta es: " + precioVenta);        
    }    
}
/***
 * EVIDENCIA DEL RUN:
 * Ingrese la marca, origen y costo: 
Suzuki Japon 18500
El impuesto a pagar es: 5550.0
El precio de venta es: 24050.0
* Ingrese la marca, origen y costo: 
Ferrari Italia 250000
El impuesto a pagar es: 37500.0
El precio de venta es: 287500.0
* Ingrese la marca, origen y costo:
Jeep USA 29000
El impuesto a pagar es: 2320.0
El precio de venta es: 31320.0
 */