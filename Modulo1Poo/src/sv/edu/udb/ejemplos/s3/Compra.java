package sv.edu.udb.ejemplos.s3;

public class Compra {
    private int codigoCompra;
    private String numeroOrden;
    private String proveedor;
    
    //Metodos constructores
    public Compra() {
    }

    public Compra(int codigoCompra, String numeroOrden, String proveedor) {
        this.codigoCompra = codigoCompra;
        this.numeroOrden = numeroOrden;
        this.proveedor = proveedor;
    }
    
    //Setter y getter

    public int getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(int codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public String getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(String numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
}
