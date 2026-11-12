
import java.util.Scanner;

/**
 * Ejercicio 06: "Categoría de Edad: Clasificar a una persona en una 
 * categoría de edad (niño, adolescente, adulto) en función de su edad."
 * @author Noelia, Sofia
 * @version 1.0
 */
public class Ejercicio06_CategoriaDeEdad {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = tcl.nextInt();
        String categoria;
        if (edad <= 11)
            categoria = "Niño";
        else if (edad <= 18)  
            categoria = "Adolescente";
            else 
                categoria = "Adulto";
    System.out.print("Su categoria corresponde a: " + categoria);        
    }   
}
