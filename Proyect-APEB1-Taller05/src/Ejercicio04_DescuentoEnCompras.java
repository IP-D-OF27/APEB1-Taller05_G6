
import java.util.Scanner;

/**
 * Ejercicio 04: "Descuento en Compras: Calcular el precio final de un producto
 * con un descuento del 10% si el precio original es mayor de $100 ; 
 * De lo contrario, no hay descuento.
 * @author Noelia, Sofia
 * @version 1.0
 */
public class Ejercicio04_DescuentoEnCompras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Deme precio: ");
        double precio = tcl.nextDouble(), descuento = 1;
        if (precio > 100)
            descuento = 0.9;
        precio *= descuento;
        System.out.println("Precio: " + precio);        
    }    
}
/**
 * EVIDENCIA DEL RUN:
 * Deme precio: 
1000
Precio: 900.0
 */