import java.util.Scanner;
/**
 * Ejercicio 05: "Comprobar si un año ingresado es bisiesto o no. Si es bisiesto,
 * mostrar un mensaje especial"
 * @author Sofia, Noelia
 * @version 1.0
 */
public class Ejercicio05_AñoBisiesto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese un año: ");
        int anio = tcl.nextInt();
        if (anio % 4 == 0)
            System.out.println("Feliz Cumpleaños Noe, eres tan especial que se"
                    + "toma el calendario cuatro años para volverte a celebrar ");
        else 
            System.out.println("No es año Bisiesto: ");     
    }  
}
/**
 * EVIDENCIA RUN FILE:
 * 
 */