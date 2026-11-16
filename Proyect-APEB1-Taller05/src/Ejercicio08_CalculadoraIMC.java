
import java.util.Scanner;

/**
 * Ejercicio 08: "Calculadora de IMC: Calcula el índice de masa corporal (IMC)
 * de una persona y la clasifica en función de su valor
 * (bajo peso, peso normal, sobrepeso, etc.) ."
 * @author Noelia, Sofia
 * @version 1.0
 */
public class Ejercicio08_CalculadoraIMC {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese su altura en metros y peso en Kg: ");
        double altura = tcl.nextDouble(), peso = tcl.nextDouble(), imc;
        String rango;
        imc = peso/Math.pow(altura, 2);
        if (imc <= 18.5) {
            rango = "Bajo Peso";
        }   else if (imc <= 24.9) {
                rango = "Peso normal";
        }    else if(imc <= 29.9) {
                rango = "Sobrepeso";
        }    else {
                rango = "Obesidad";
        }
        System.out.printf("Su índice de masa corporal(IMC) es: %.1f\n" , imc);
        System.out.println("Su rango corresponde a: " + rango);               
    }   
}
/**
 * EVIDENCIA DEL RUN
 * Ingrese su altura en metros y peso en Kg: 
1,55
48
Su �ndice de masa corporal(IMC) es: 20,0
Su rango corresponde a: Peso normal
 */