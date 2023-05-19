package sv.edu.udb.ejercicios.s2;

import sv.edu.udb.ejemplos.s2.Cliente;


/**
 *
 * @author aleev
 */
public class Empleado {
    int carnet;
    String nombres;
    String apellidos;
    String direccion;
    String telefono;
    String cargo;
    
    public int realizarVenta(){
        int idVenta=1;
        return idVenta;
    }
    
    public static double aplicarDescuentos(){
        double descuentos=10.0;
        return descuentos;
    }
    
    public static String buscarCliente(){
        return "Alejandro Velasco";
    }
}
