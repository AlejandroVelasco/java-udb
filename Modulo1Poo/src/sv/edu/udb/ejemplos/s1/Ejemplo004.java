package sv.edu.udb.ejemplos.s1;
import java.util.Scanner;

public class Ejemplo004 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean bandera = true;
        int contador = 1;

        while (bandera) {
            System.out.println(contador + " año tiene " + (contador * 365) + " dias");
            System.out.println("Si desea continuar escriba SI");
            String continuar = in.nextLine();
            if (!continuar.equalsIgnoreCase("SI"))
                bandera = false;
            contador++;
        }
    }
}