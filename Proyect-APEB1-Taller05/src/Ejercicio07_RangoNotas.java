import java.util.Scanner;
/**
 * Ejercicio 07: "TAsignar una letra (A, B, C, D) a una calificación en función
 * de su rango (A para 90-100, B para 80-89, etc.)."
 * @author Sofia, Noelia
 * @version 1.0
 */
public class Ejercicio07_RangoNotas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese su calificación: ");
        double calificación = tcl.nextDouble ();
        char letra;
        if (calificación >= 90 && calificación <= 100)
            letra = 'A';
        else if (calificación >= 80)
            letra = 'B';
        else if (calificación >= 70)
            letra = 'C';
        else if (calificación >= 60)
            letra = 'D';
        else
            letra = 'F';
        System.out.println("Su calificación es: " + letra);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * Ingrese su calificación: 
75
Su calificación es: C
 */