/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.ejercicios.s3;

public class TestPerro {

    public static void main(String[] args) {
        Perro perro1 = new Perro();
        perro1.setNombre("Perro 1");
        perro1.setTamanio(100);
        
        Perro perro2 = new Perro();
        perro2.setNombre("Perro 2");
        perro2.setTamanio(50);
        
        Perro perro3 = new Perro();
        perro3.setNombre("Perro 3");
        perro3.setTamanio(10);
        
        System.out.println("Perro: " + perro1.getNombre());
        System.out.println("Tamaño: " + perro1.getTamanio());
        perro1.ladrar();
        System.out.println("\n");
        
        System.out.println("Perro: " + perro2.getNombre());
        System.out.println("Tamaño: " + perro2.getTamanio());
        perro2.ladrar();
        System.out.println("\n");
        
        System.out.println("Perro: " + perro3.getNombre());
        System.out.println("Tamaño: " + perro3.getTamanio());
        perro3.ladrar();
    }
    
}
