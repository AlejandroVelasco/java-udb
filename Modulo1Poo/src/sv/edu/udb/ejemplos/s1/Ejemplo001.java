
package sv.edu.udb.ejemplos.s1;
import java.util.Scanner;

public class Ejemplo001 {

    /**
     * Atajo: main+tab
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables primitivos
        
        //FASE I. DECLARACIÓN DE PANTALLAS
        String nombres; //texto
        String apellidos; //texto
        String estadoCivil; //texto
        int edad; //entero
        float estatura; //decimales
        
        //FASE II. ALMACENAR VARIABLES
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombres = in.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellidos = in.nextLine();
        System.out.println("Ingrese estado civil");
        estadoCivil = in.nextLine();
        System.out.println("Digite su edad: ");
        edad = in.nextInt();
        System.out.println("Digite su estatura en cm");
        estatura = in.nextFloat();
        
        //FASE III. MOSTRAR RESULTADOS
        System.out.println("Su nombre es: " + nombres);
        System.out.println("Sus apellidos son: " + apellidos);
        System.out.println("estado civil: " + estadoCivil);
        System.out.println("edad: " + edad);
        System.out.println("estatura: " + estatura);
    }
    
}
