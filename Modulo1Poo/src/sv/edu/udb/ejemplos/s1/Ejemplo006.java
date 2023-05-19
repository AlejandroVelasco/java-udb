
package sv.edu.udb.ejemplos.s1;

import java.util.Scanner;

public class Ejemplo006 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Utilizando estructura DO-WHILE");
        int cantidad;
        String op;
        double sueldo, total = 0;
        
        do{
            System.out.println("Cuantos empleados va a registrar");
            cantidad= Integer.parseInt(in.nextLine());
            for(int i=1; i<=cantidad; i++){
                System.out.println("Ingrese sueldo: $");
                sueldo= Double.parseDouble(in.nextLine());
                total += sueldo;
            }
            System.out.println("\tEl total del dinero invertido es: $"+total);
            System.out.println("\t¿Otro empleado? Y/N");
            op=in.nextLine();
        }while(op.equalsIgnoreCase("Y"));
    
    }
}
