/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.ejemplos.s1;

import java.util.Scanner;

/**
 *
 * @author aleev
 */
public class Ejemplo002 {

    public static void main(String[] args) {
        //EJEMPLO DE IF
        /*Sintaxis
        if(condicion){
        }
        else if (condicion2){
        }
        else{
        }
        */
        int edad;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese edad: ");
        edad = in.nextInt();
        
        if(edad <= 12){
            System.out.println("Es un niño");
        }else if(edad <= 25){
            System.out.println("Es un joven");
        }else{
            System.out.println("Es un adulto");
        }

    }
}
