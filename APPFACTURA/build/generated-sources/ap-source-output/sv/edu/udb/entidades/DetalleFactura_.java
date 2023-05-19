package sv.edu.udb.entidades;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.udb.entidades.Factura;
import sv.edu.udb.entidades.Producto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-07-10T15:03:29")
@StaticMetamodel(DetalleFactura.class)
public class DetalleFactura_ { 

    public static volatile SingularAttribute<DetalleFactura, BigDecimal> precio;
    public static volatile SingularAttribute<DetalleFactura, BigDecimal> total;
    public static volatile SingularAttribute<DetalleFactura, BigDecimal> iva;
    public static volatile SingularAttribute<DetalleFactura, Factura> idFactura;
    public static volatile SingularAttribute<DetalleFactura, Integer> cantidad;
    public static volatile SingularAttribute<DetalleFactura, Producto> idProducto;
    public static volatile SingularAttribute<DetalleFactura, Integer> idDetalleFactura;

}