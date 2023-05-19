package sv.edu.udb.ejemplos.s1;

import java.util.Scanner;

public class Ejemplo005 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Utilizando estructura while");
        int contador = 1;
        double suma = 0;
        int n=0;
        double prom;
        
        while(contador <= 5){
            System.out.println("Ingrese un número entero: [" + contador + "]");
            n = Integer.parseInt(in.nextLine());
            suma = suma + n;
            contador++;
        }   
        System.out.println("La suma de 5 números ingresados es: "+suma);
        prom = suma/5;
        System.out.println("El promedio de los números ingresados es: " + String.format("%.2f",prom));
    }
    
}
