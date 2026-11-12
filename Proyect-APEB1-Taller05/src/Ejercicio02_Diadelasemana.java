
import java.util.Scanner;

/**
 * Ejercicio 02: "Mostrar el nombre del día de la semana en función del 
 * número ingresado (1 para lunes, 2 para martes, etc.)."
 * @author Noelia, Sofia
 * @version 1.0
 */
public class Ejercicio02_Diadelasemana {
    public static void main(String[] args) {
        String nombreDia;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Dame nro. de dia: ");
        int nroDias = tcl.nextInt();
        switch (nroDias)
        {   case 1:
                nombreDia = "lunes";
                break;
            case 2:
                nombreDia = "martes";
                break;
            case 3:
                nombreDia = "miercoles";
                break;
            case 4:
                nombreDia = "jueves";
                break;
            case 5:
                nombreDia = "viernes";
                break;
            case 6:
                nombreDia = "sabado";
                break;
            case 7:
                nombreDia = "domingo";
                break;
            default:
                nombreDia = "error";
        } 
        System.out.println("El nro de la semana: " + nroDias + " " + 
                "corresponde a:"+ nombreDia);
    }   
}
/***
 * EVIDENCIA DEL RUN:
 * Dame nro. de dia: 
6
El nro de la semana: 6 corresponde a:sabado
 */