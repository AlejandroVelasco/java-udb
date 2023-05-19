package sv.edu.udb.entidades;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.udb.entidades.DetalleFactura;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-07-10T15:03:29")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile SingularAttribute<Producto, BigDecimal> precio;
    public static volatile SingularAttribute<Producto, Integer> idProducto;
    public static volatile ListAttribute<Producto, DetalleFactura> detalleFacturaList;

}