package sv.edu.udb.ejemplos.s2;

/**
 *
 * @author aleev
 */
public class Cliente {
    int codigoCliente;
    String nombres;
    String apellidos;
    String dui;
    String telefono;
    String direccion;
    String correo;
    boolean estado; //true=activo, false=inactivo
    
    /**
    1.Ambito: public, private, protected, sim ambito
        1.1 public --> Metodo lo podemos utilizar desde otra clase del proyecto
        1.2 private --> Metodo solo se puede utilizar desde esta misma clase
        1.3 protected -- Metodo visible desde esta clase e hijas(herencia)
        1.4 sin ambito --> Metodo visible desde cualquier clase dentro del mismo
                            paquete. 2. Valor de retorno
    3. Nombre del metodo (parametros que recibe)
     * @return 
    */
    public static String buscarProducto(){
      return "Este metodo devuelve la información del producto";
    }
    
    public void pagarCompra(){
        System.out.println("Este metodo registra la compra del cliente");
    }
    
}