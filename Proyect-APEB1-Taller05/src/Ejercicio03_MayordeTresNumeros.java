import java.util.Scanner;
/**
 * Ejercicio 03: "Mayor de tres números: Dados tres números distintos,
 * determinar cuál es el mayor."
 * @author Sofia, Noelia
 * @version 1.0
 */
public class Ejercicio03_MayordeTresNumeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Deme 3 números");
        int n1 = tcl.nextInt(), n2 = tcl.nextInt(), n3 = tcl.nextInt(), mayor;
        if (n1 > n2)
            mayor = n1;
        else
            mayor = n2;
        if (n3 > mayor)
            mayor = n3;
        System.out.println(mayor);
    } 
}
/**
 * EVIDENCIA:
 * Deme 3 números
3 2 1
3
 */