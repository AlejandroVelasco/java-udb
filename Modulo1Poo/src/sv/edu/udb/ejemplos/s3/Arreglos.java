package sv.edu.udb.ejemplos.s3;

import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] positivos = new int[10];
        int[] negativos = new int[10];
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        
        System.out.println("Ingrese 10 números enteros");
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese número " + (i+1));
            numeros[i] = Integer.parseInt(in.nextLine());
        }
        
        for (int i=0; i <= 9; i++){
            if (numeros[i]<0){
                negativos[contadorNegativos] = numeros[i];
                contadorNegativos++;
            }else{
                positivos[contadorPositivos] = numeros[i];
                contadorPositivos++;
            }
        }
        
        System.out.println("Positivos");
        for (int i=0; i <contadorPositivos-1; i++){
            System.out.println(positivos[i]);
        }
        
                System.out.println("Negativos");
        for (int i=0; i <contadorPositivos-1; i++){
            System.out.println(positivos[i]);
        }
        
    }
    
}
