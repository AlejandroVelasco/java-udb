package sv.edu.udb.ejemplos.s3;

public class TestCompra {

    public static void main(String[] args) {
        Compra compraHoy = new Compra();
        compraHoy.setCodigoCompra(1);
        compraHoy.setNumeroOrden("001");
        compraHoy.setProveedor("EMPRESA XYZ");
        
        System.out.println("Codigo Compra = " + compraHoy.getCodigoCompra());
        System.out.println("Número Orden = " + compraHoy.getNumeroOrden());
        System.out.println("Proveedor = " + compraHoy.getProveedor());
        
    }
    
    
    
}
