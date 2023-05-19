package sv.edu.udb.ejemplos.s2;

import java.util.Scanner;

/**
 *
 * @author aleev
 */
public class Ejemplo003Metodos {
    
    static double valor;
    
    public static void main(String[] args) {
        String cliente = Cliente.buscarProducto();
        System.out.println("cliente = " + cliente);
        
        Scanner in = new Scanner(System.in);
        int opc;
        imprimirMenu();
        opc = Integer.parseInt(in.nextLine());
        System.out.println("Digite valor a convertir");
        valor = Double.parseDouble(in.nextLine());
        
        switch(opc){
            case 1:
                System.out.println("El resultado de la conversion es " + 
                        cmsAPulgadas());
                break;
            case 2:
                System.out.println("El resultado de la conversion es " +
                        (valor/100));
                break;
        }
    }
    
    public static void imprimirMenu(){
        System.out.println("Metodo main");
        System.out.println("Seleccione una opción");
        System.out.println("[1] Centimetros a pulgadas");
        System.out.println("[2] Metros a centimetros");
    }
    
    public static double cmsAPulgadas(){
        double resultado = valor * 3.28;
        return resultado;
    }
}