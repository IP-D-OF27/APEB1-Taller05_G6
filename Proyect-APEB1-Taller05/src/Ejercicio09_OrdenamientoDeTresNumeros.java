import java.util.Scanner;
/**
 * Ejercicio 09: " Dados tres números, ordenarlos en orden ascendente."
 * @author Sofia, Noelia
 * @version 1.0
 */
public class Ejercicio09_OrdenamientoDeTresNumeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double num1, num2, num3;
        double menor, medio, mayor;
        System.out.print("Ingrese el primer número: ");
        num1 = tcl.nextDouble();
        System.out.print("Ingrese un segundo número: ");
        num2 = tcl.nextDouble();
        System.out.print("Ingrese un tercer número: ");
        num3 = tcl.nextDouble();
        if (num1 <= num2 && num2 <= num3) {
            System.out.print("Orden ascendente: " + num1 + " - " + num2 + " - " + num3);
        } else if (num1 <= num3 && num3 <= num2) {
            System.out.print("Orden ascendente: " + num1 + " - " + num3 + " - " + num2);
        } else if (num2 <= num1 && num1 <= num3) {
            System.out.print("Orden ascendente: " + num2 + " - " + num1 + " - " + num3);
        } else if (num2 <= num3 && num3 <= num1) {
            System.out.print("Orden ascendente: " + num2 + " - " + num3 + " - " + num1);
        } else if (num3 <= num1 && num1 <= num2) {
            System.out.print("Orden ascendente: " + num3 + " - " + num1 + " - " + num2);
        } else {
            System.out.print("Orden ascendente: " + num3 + " - " + num2 + " - " + num1);
        }
           
       }
   } 
}
/***
 * EVIDENCIA DEL RUN:
 * Ingrese el primer número: 56
Ingrese un segundo número: 78
Ingrese un tercer número: 32
Orden ascendente: 32.0 - 56.0 - 78.0
 */