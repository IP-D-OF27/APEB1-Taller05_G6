
import java.util.Scanner;

/**
 * Ejercicio 10: "Valores pares o impares: Dado un valor entero ingresado por 
 * teclado (positivo o negativo) , determine si se trata de un valor par o impar."
 * @author Noelia, Sofia
 * @version 1.0
 */
public class Ejercicio10_ValoresParesOImpares {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese un numero entero(positivo o negativo)): ");
        int numero = tcl.nextInt();
        if (numero %2 == 0)
            System.out.println("El numero es par");
        else
            System.out.println("El numero es impar");
    }   
}
/** EVIDENCIA DEL RUN:
 *  Ingrese un numero entero(positivo o negativo)): 
123
El numero es impar
 */
