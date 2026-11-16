import java.util.Scanner;
/**
 * Ejercicio 11: "Desarrollar una solución que imprima el costo de un pedido de 
 * un artículo del cual se tiene la descripción, la cantidad que se requiere
 * y el precio unitario. Si la cantidad pedida excede de 50 unidades, se hace
 * un descuento de 15%."
 * @author Sofia,Noelia
 * @version 1.0
 */
public class Ejercicio11_PedidosOnline {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese descripción del artículo: ");
        String descripción = tcl.nextLine();
        System.out.println("Ingrese la cantidad: ");
        int cantidad = tcl.nextInt();
        System.out.println("Ingrese el precio unitario: ");
        double precioUni = tcl.nextDouble();
        double subtotal = cantidad * precioUni;
        double totalPagar;
        double descuento = 0;
        if (cantidad > 50)
            descuento = subtotal * 0.15;
        else
            descuento = 0;
        totalPagar = subtotal - descuento;
        System.out.println("Artículo: " + descripción + " | Total a pagar: $" +
                totalPagar);       
    }
}

/***
 * EVIDENCIA DEL RUN:
 * Ingrese descripción del artículo: 
Llantas para mi vehículo
Ingrese la cantidad: 
4
Ingrese el precio unitario: 
57
Artículo: Llantas para mi vehículo | Total a pagar: $228.0
 */